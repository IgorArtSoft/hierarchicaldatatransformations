package dev.igorartsoft.hierarchical.data.xml.jasperreports.transformations;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBException;

import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.JasperReport;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.LabelValues;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.ReportElement;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.SortableField;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.StaticText;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.Text;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.TextField;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.TextFieldExpression;

/**
 * 
 * Incorporates common logic, which can be re-used for other transformations.
 *  
 * @author 	Igor Artimenko (igorart7@gmail.com)
 * @version 1.0.0 Initial 
 *
 */
public abstract class BaseCustomTransformator implements ICommonCustomTransformation{
	
	/**
	 * Purpose of this method is to unify transformation process.
	 * 
	 * It does custom ordering of original jrxml file.
	 * It saves new version of JasperReport file into marshalled directory.
	 * New version file could be deployed.
	 *  
	 * @param jasperReport
	 * 
	 */
	void process( String fileToParce ) throws JAXBException{
		
		// Unmarshall the file
		File originalFile = new File( ORIGINAL_DIRECTORY + fileToParce + ".jrxml" );
			    
		JasperReport jasperReport = parseJasperFile( originalFile );
		
		doCustomizedSorting( jasperReport );
		
		File parsedFile = new File( MARSHALLED_DIRECTORY + fileToParce + ".jrxml" );
		
		saveIntoJasperFile( jasperReport, parsedFile, true );
	    
	}

	public abstract void doCustomizedSorting( JasperReport jasperReport );
	
	/**
	 * This method establishes if labelRepElement & valueRepElement really belong to each other.
	 * If an xml file does not contain explicit logic of label value pair.
	 * 
	 * It's extremely important for example for jasper jrxml files, because those do not have knowledge which element is a label, which is a value.  
	 * 
	 * @param labelRepElement
	 * @param valueRepElement
	 * @return
	 * 
	 */
	public boolean isInCloseProximity( ReportElement labelRepElement, ReportElement valueRepElement ){
		boolean isInCloseProximity = false;
		
		int labelY = labelRepElement.getIntY();
		int labelX = labelRepElement.getIntX();	
		int labelH = labelRepElement.getIntHeight();
		int labelW = labelRepElement.getIntWidth();	
		
		int valueY = valueRepElement.getIntY();
		int valueX = valueRepElement.getIntX();
		int valueW = valueRepElement.getIntWidth();
		
		// A textField is inside of label's rectangular.
		if( ( labelY <= valueY && valueY <= labelY + labelH ) && 
		  ( labelX <= valueX && valueX <= labelX + labelW ) ) {
			isInCloseProximity = true;
		}
		// A valueRepElement is in close proximity to the right top corner of label's rectangular.
		else if( ( labelY - CLOSE_PROXIMITY_Y <= valueY && valueY <= labelY + CLOSE_PROXIMITY_Y ) && 
				 ( labelX + labelW - CLOSE_PROXIMITY_Y <= valueX && valueX <= labelX + labelW + CLOSE_PROXIMITY_Y ) ) {
			isInCloseProximity = true;
		}
		// A valueRepElement is in close proximity to the bottom left corner of label's rectangular.
		else if( ( labelY + labelH - CLOSE_PROXIMITY_Y <= valueY && valueY <= labelY + labelH + CLOSE_PROXIMITY_Y ) && 
				 ( labelX - CLOSE_PROXIMITY_Y <= valueX && valueX <= labelX + CLOSE_PROXIMITY_Y ) ) {
			isInCloseProximity = true;
		}
		// Values are on the left of label
		// A label's is in close proximity to the right top corner of valueRepElement rectangular.
		else if( ( labelY - CLOSE_PROXIMITY_Y <= valueY && valueY <= labelY + CLOSE_PROXIMITY_Y ) && 
				 ( labelX - CLOSE_PROXIMITY_Y <= ( valueX + valueW ) && ( valueX + valueW ) <= labelX + CLOSE_PROXIMITY_Y ) ) {
			isInCloseProximity = true;
		}
		// A label's is in close proximity to the bottom left corner of valueRepElement rectangular.
		else if( ( labelY + labelH - CLOSE_PROXIMITY_Y <= valueY && valueY <= labelY + labelH + CLOSE_PROXIMITY_Y ) && 
				 ( labelX - CLOSE_PROXIMITY_Y <= ( valueX + valueW ) && ( valueX + valueW ) <= labelX + CLOSE_PROXIMITY_Y ) ) {
			isInCloseProximity = true;
		}
		
		return isInCloseProximity;
	} 
	
	int countTextFields(LabelValues[] labelValues){
		
		int totalTextFields = 0;
		
		if( labelValues != null ){
			for (int i = 0; i < labelValues.length; i++) {
				
				TextField[] textFieldsLabels = labelValues[i].getTextField();
				if( textFieldsLabels != null ){
					totalTextFields = totalTextFields + textFieldsLabels.length;	
				}
				
			}			
		}

		return totalTextFields;
		
	}
	
	void accumulateCurrentGroupLabelValues(	List<LabelValues> allLabelValues, List<SortableField> groupElements ) {
		
		int totalTextFields = countTextFields( allLabelValues.toArray( new LabelValues[ allLabelValues.size() ] ) );
		System.out.println( "Start of method allLabelValues " + allLabelValues.size() + ", including totalTextFields " + totalTextFields );
		
		List<SortableField> customSortedLabels = new ArrayList<SortableField>();
		List<SortableField> customSortedValues = new ArrayList<SortableField>();
				
		for (SortableField sortableField : groupElements) {		
			if( sortableField instanceof StaticText ){
				customSortedLabels.add( sortableField );
			}
			else if( sortableField instanceof TextField ){
				customSortedValues.add( sortableField );
			}
		}
		
		customSortedLabels.forEach( label -> {
			
			LabelValues currentLabelValues = new LabelValues();
			currentLabelValues.setStaticText( (StaticText)label );
						
			ReportElement repLabel = label.getReportElement();
			
			Iterator<SortableField> iter = customSortedValues.iterator();
			List<TextField> textFields = new ArrayList<TextField>();
			
			while (iter.hasNext()) {
				
				SortableField value = iter.next();
				ReportElement repValue = value.getReportElement();
				
				if( ( repLabel.getIntY() <= repValue.getIntY() && repValue.getIntY()<= repLabel.getIntY() + repLabel.getIntHeight() ) && 
				  ( repLabel.getIntX() <= repValue.getIntX() && repValue.getIntX()<= repLabel.getIntX() + repLabel.getIntWidth() ) ){
					textFields.add( (TextField)value );
					iter.remove();	
				}	
		        
			}
			currentLabelValues.setTextField( textFields.toArray( new TextField[ textFields.size() ] ) );
			allLabelValues.add( currentLabelValues );
			
		});	

		// Let's not forget unallocated customSortedValues
		customSortedValues.forEach( sortableField-> {
			
			LabelValues currentLabelValues = new LabelValues();
			TextField[] textField = new TextField[1];
			textField[0] = (TextField)sortableField;
			currentLabelValues.setTextField( textField );
			allLabelValues.add( currentLabelValues );
			
		});
		
		long totalValuesCurrentGroup = allLabelValues.stream().filter( labelValue-> labelValue.getStaticText() != null ).count();
		
		totalTextFields = countTextFields( allLabelValues.toArray( new LabelValues[ allLabelValues.size() ] ) );
		System.out.println( "End of allLabelValues method " + totalValuesCurrentGroup + ", including totalTextFields " + totalTextFields );
		
	}	

	void accumulateOtherGroupLabelValues( List<LabelValues> allLabelValues, List<SortableField> groupElements ) {
		
		int totalTextFields = countTextFields( allLabelValues.toArray( new LabelValues[ allLabelValues.size() ] ) );
		System.out.println( "Start of method allLabelValues " + allLabelValues.size() + " including totalTextFields " + totalTextFields );
		
		List<SortableField> customSortedLabels = new ArrayList<SortableField>();
		List<SortableField> customSortedValues = new ArrayList<SortableField>();
		
		Collections.sort( groupElements, xmlElementComparator );
		
		for (SortableField sortableField : groupElements) {		
			if( sortableField instanceof StaticText ){
				customSortedLabels.add( sortableField );
			}
			else if( sortableField instanceof TextField ){
				customSortedValues.add( sortableField );
			}
		}
		
		for (SortableField label : customSortedLabels) {
			
			LabelValues currentLabelValues = new LabelValues();
			currentLabelValues.setStaticText( (StaticText)label );
			
			ReportElement repLabel = label.getReportElement();
			
			Iterator<SortableField> iter = customSortedValues.iterator();
			List<TextField> textFields = new ArrayList<TextField>();
			
			while (iter.hasNext()) {
				
				SortableField value = iter.next();
				ReportElement repValue = value.getReportElement();
				
				if( isInCloseProximity( repLabel,  repValue ) ){
					textFields.add( (TextField)value );
					iter.remove();	
					break;
				}	
		        
			}
			currentLabelValues.setTextField( textFields.toArray( new TextField[ textFields.size() ] ) );
			allLabelValues.add( currentLabelValues );
		}		
				
		for (SortableField sortableField : customSortedValues ) {
			LabelValues currentLabelValues = new LabelValues();
			if( sortableField instanceof StaticText ){
				StaticText label = (StaticText)sortableField;
				currentLabelValues.setStaticText(label);
			}
			else if( sortableField instanceof TextField ){
				TextField[] textField = new TextField[1];
				textField[0] = (TextField)sortableField;
				currentLabelValues.setTextField( textField );				
			}
			allLabelValues.add( currentLabelValues );
		}
		
	}
	
	/**
	 * Used for debugging and testing purposes
	 * 
	 * @param groupName
	 * @param sortableFields
	 * @param formatString
	 * @param formatStringGroup
	 * @param groupDimentions
	 */
	void showGroupElements( String groupName, List<SortableField> sortableFields, String formatString, String formatStringGroup, ReportElement groupDimentions ){
		
		System.out.println( groupName + " " + ( groupDimentions!= null ? groupDimentions.toString() : "" ) + ". Elements in the group= " + ( sortableFields != null ? sortableFields.size() : null ) );
		
		if( formatStringGroup != null && groupDimentions != null ){
			System.out.printf( formatStringGroup, " " );
			System.out.println( 
					"XRange=" + groupDimentions.getX() + "-" + ( groupDimentions.getIntX() + groupDimentions.getIntWidth() )  + ", " + 
					"YRange=" + groupDimentions.getY() + "-" + ( groupDimentions.getIntY() + groupDimentions.getIntHeight() )
			);
		}
		
		for (SortableField sortableField : sortableFields) {
			ReportElement currElement = sortableField.getReportElement();
			if( sortableField instanceof TextField ){
				TextFieldExpression textFieldExpression = ((TextField)sortableField).getTextFieldExpression();														
				System.out.print( " " );
				System.out.printf( formatString, ( textFieldExpression != null ? textFieldExpression.getContent().trim().replaceAll( "\n", " " ) : null ) );
				System.out.println( currElement.toString() );
			}
			else if( sortableField instanceof StaticText ){
				Text text = ((StaticText)sortableField).getText();
				System.out.print( " " );
				System.out.printf( formatString, ( text != null ? text.getContent().trim().replaceAll( "\n", " " ) : null ) );
				System.out.println( currElement.toString() );						
			}
			else{
				System.out.println( " " + currElement.toString() );
			}
		}
		System.out.println( SEPARATOR );
	}
	
}
