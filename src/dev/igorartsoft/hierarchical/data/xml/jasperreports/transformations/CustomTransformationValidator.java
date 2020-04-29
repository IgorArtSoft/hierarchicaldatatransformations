package dev.igorartsoft.hierarchical.data.xml.jasperreports.transformations;

import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.bind.JAXBException;

import dev.igorartsoft.hierarchical.data.xml.jasperreports.model.JasperReport;

/**
 * This class does complex validations, to make sure that content of new and original version of jrxml file is the same.  
 * 
 * @author 	Igor Artimenko (igorart7@gmail.com)
 * @version 1.0.0 Initial 
 *
 */
public class CustomTransformationValidator implements ICommonCustomTransformation{
		
	public boolean validateNewAndOriginal( String originalFileName, String newFileName ) throws Exception{

		Path pathOriginal = Paths.get( ORIGINAL_DIRECTORY + originalFileName + ".jrxml" );
		Path pathNew = Paths.get( MARSHALLED_DIRECTORY + newFileName + ".jrxml" );
	    
	    formattedXMLFile( BASE_DIRECTORY + "/data/original/" + originalFileName );
	    		
		try ( Stream<String> stream = Files.lines( pathNew, StandardCharsets.UTF_8 )) {
			
			// Try to open new file. Remove empty lines and lines containing labelValues>. Save it back.
			Files.write( Paths.get( MARSHALLED_DIRECTORY + newFileName + "Converted.jrxml" ), 
				(Iterable<String>)stream.filter( line -> line != null && line != "" && !line.contains( "labelValues>" ) )::iterator );			
			
			formattedXMLFile( MARSHALLED_DIRECTORY + newFileName + "Converted" );
			
			String formattedOriginal = ORIGINAL_DIRECTORY + originalFileName + "Formatted.jrxml";
			String formattedNew = MARSHALLED_DIRECTORY + newFileName + "ConvertedFormatted.jrxml";
			
			// String compare of original and converted files
			performStringValidations( formattedOriginal, formattedNew );		
		    		
		}
		
		return true;
		
	}

	private boolean performStringValidations( String originalFileName, String newFileName ) throws Exception{
		
		Path originalPath = Paths.get( originalFileName );
		Path newPath = Paths.get( newFileName );
		
		// Step 1. Compare overall size
	    FileChannel originalConvertedFileChannel = FileChannel.open( originalPath );		 
	    long originalConvertedFileFileSize = originalConvertedFileChannel.size();
	    originalConvertedFileChannel.close();
	    
	    FileChannel newConvertedFileChannel = FileChannel.open( newPath );
	    long newConvertedFileFileSize = newConvertedFileChannel.size();
	    newConvertedFileChannel.close();
	    
	    if( originalConvertedFileFileSize != newConvertedFileFileSize ){
	    	System.out.println( "Original and new files are different. " + originalConvertedFileFileSize + " " + newConvertedFileFileSize );
	    	return false;
	    } else {
	    	System.out.println( "Original and new files have the same size. " + originalConvertedFileFileSize );
	    }
		
		// Step 2. Read original and new converted files. Sort lines alphabetically. Compare and output the difference.
	    List<String> originalLines = null; 
	    try ( Stream<String> streamOriginal = Files.lines( originalPath, StandardCharsets.UTF_8 )) {
	    	originalLines = streamOriginal.map( line-> line.trim() ).collect( Collectors.toList() );
	    	originalLines.sort((e1, e2) -> e1.compareTo(e2));
	    }
	    
	    List<String> newLines = null; 
	    try ( Stream<String> streamNew = Files.lines( newPath, StandardCharsets.UTF_8 )) {
	    	newLines = streamNew.map( line-> line.trim() ).collect( Collectors.toList() );
	    	newLines.sort((e1, e2) -> e1.compareTo(e2));
	    }
	    // Sorted collection
	    if( originalLines == null || newLines == null ){
	    	System.out.println( "Something wrong with parces file content. originalLines: " + originalLines + " newLines: " + newLines );
	    	return false;
	    }
	    else if( !originalLines.equals(newLines) ){
	    	System.out.println( "Files have DIFFERENT content, but the same size" );
	    	return false;
	    }
	    else{
	    	System.out.println( "Files have the SAME content" );
	    }	
	    
	    return true;
	}
	
	private void formattedXMLFile( String fileName ) throws JAXBException {
		    
		JasperReport jasperReport = parseJasperFile( new File( fileName + ".jrxml") );
		
	    saveIntoJasperFile( jasperReport, new File( fileName + "Formatted.jrxml" ), true  );
	    
	}
	
}
