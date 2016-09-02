package com.goeuro.cli.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.goeuro.cli.beans.City;

/**
 * CSV Output File Writer
 * @author ahmedeid
 * This class is responsible for writing output file
 */
@ConfigurationProperties(prefix="outputFile")
@Component
public class CSVFileWriter {
	
	private static final Logger log = LoggerFactory.getLogger(CSVFileWriter.class);
	
	String name;
	List<String> fields;
	
	/**
	 * Writes CSV output file
	 * @param cities : array of cities
	 * @throws IOException
	 */
	public void writeLocations(City[] cities) throws IOException{
		  log.info("writing output file: "+name);
		  ICsvBeanWriter csvWriter = new CsvBeanWriter(new FileWriter(new File(name)), CsvPreference.STANDARD_PREFERENCE); 
		  String[] header  = new String[fields.size()];
		  header = fields.toArray(header);
		  for (City city : cities) {
	            csvWriter.write(city, header);
	        }
	        
	      csvWriter.close();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFields() {
		return fields;
	}
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	
}
