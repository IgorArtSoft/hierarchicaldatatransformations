package dev.igorartsoft.hierarchical.data.xml.jasperreports.transformations.comparators;

import java.util.Comparator;

import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.ReportElement;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.SortableField;

/**
 * Helps to sort collections of SortableField objects in ascending order of y, x coordinates
 *  
 * @author 	Igor Artimenko (igorart7@gmail.com)
 * @version 1.0.0 Initial 
 * 
 */
public class XmlElementComparator implements Comparator<SortableField> {

	/* 
	 * This method sorts elements in top to down, left to right fashion.
	 *   
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 */
	@Override
	public int compare(SortableField field1, SortableField field2 ) {
		
		if( field1 == null ){
			return -1;
		}
		else if( field2 == null ){
			return 1;
		}
		else{
			
			ReportElement reportElement0 = field1.getReportElement();
			ReportElement reportElement1 = field2.getReportElement();
			
			if( reportElement0 == null ){
				return -1;
			}
			else if( reportElement1 == null ){
				return 1;
			}
			else{
								
				int posY0 = new Integer( reportElement0.getY() );
				int posX0 = new Integer( reportElement0.getX() );
				
				int posY1 = new Integer( reportElement1.getY() );
				int posX1 = new Integer( reportElement1.getX() );
				
				if( posY0 < posY1 ){
					return -1;
				}
				else if( posY0 == posY1 ){
					if( posX0 < posX1 ){
						return -1;
					}
					else if( posX0 == posX1){
						return 0;
					}
					else{
						return 1;
					}
				}
				else{
					return 1;
				}
				
			}
		}
	}
	
}
