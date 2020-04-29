package dev.igorartsoft.hierarchical.data.xml.jasperreports.transformations;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.persistence.jaxb.JAXBContextProperties;

import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.JasperReport;
import dev.igorartsoft.hierarchical.data.xml.jasperreports.transformations.comparators.XmlElementComparator;

/**
 * @author Igor Artimenko
 * 
 * Contains common definitions used by Transformator & Validator.
 *	
 * @author 	Igor Artimenko (igorart7@gmail.com)
 * @version 1.0.0 Initial 
 * 
 */
public interface ICommonCustomTransformation {
	
	final static String BASE_DIRECTORY = System.getProperty("user.dir");
	final static String ORIGINAL_DIRECTORY = BASE_DIRECTORY + "/data/original/";
	final static String MARSHALLED_DIRECTORY = BASE_DIRECTORY + "/data/marshalled/";
	
	final static String JASPER_SCHEMA_LOCATION = 
			"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd";
	
	final static XmlElementComparator xmlElementComparator = new XmlElementComparator();
	
	final static int CLOSE_PROXIMITY_Y = 5; 
	final static int CLOSE_PROXIMITY_X = 5; 

	final static String SEPARATOR = "~~~"; 
	
	default JasperReport parseJasperFile( File file ) throws JAXBException {
		
		// Unmarshall the file		      
	    Class[] classes = { JasperReport.class };
       
        Map<String, Source> metadata = new HashMap<String, Source>();
        metadata.put( "dev.igorartsoft.hierarchical.data.xml.jasperreports.model", 
        		new StreamSource( BASE_DIRECTORY + "/src/dev/igorartsoft/hierarchical/data/xml/jasperreports/model/eclipselink-oxm.xml" ) );
 
        Map<String, Object> properties = new HashMap<String, Object>();
        properties.put(JAXBContextProperties.OXM_METADATA_SOURCE, metadata);
        
		JAXBContext jaxbContext = JAXBContext.newInstance(classes, properties);
		
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();	
			    
		JasperReport jasperReport = (JasperReport) unmarshaller.unmarshal(file);
		
		return jasperReport;
		
	}
	
	default void saveIntoJasperFile( JasperReport jasperReport, File parsedFile, boolean formattedOutput ) throws JAXBException  {
	    
		JAXBContext jaxbContext1 = JAXBContext.newInstance( JasperReport.class );
	    Marshaller marshaller = jaxbContext1.createMarshaller();
	 
	    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, formattedOutput );    
	    marshaller.setProperty( Marshaller.JAXB_SCHEMA_LOCATION, JASPER_SCHEMA_LOCATION );
	    
	    // Marshal the jasperReports xml elements into a file
	    marshaller.marshal( jasperReport, parsedFile );
	    System.out.println( "Marshalling for " + parsedFile.getName() + " completed succesfully." );
	    
	}
	
}
