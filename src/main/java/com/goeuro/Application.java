package com.goeuro;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.goeuro.cli.beans.City;
import com.goeuro.cli.writer.CSVFileWriter;
import com.goeuro.cli.ws.WebServiceClient;

/**
 * Application Main class
 * @author ahmedeid
 *
 */
@Configuration
@SpringBootApplication
@ComponentScan
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	WebServiceClient wsClient;
	
	@Autowired
	CSVFileWriter fileWriter;

	/**
	 * Application Entry Point
	 * @param args : command line arguments
	 */
	public static void main(String args[]) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate){
		return args -> {
			
			if(args.length < 1){
				log.error("USAGE: java -jar GoEuroTest.jar \"CITY_NAME\"");
				System.exit(1);
			}
	
			City[] cities = null;
			try{
				cities = wsClient.getCityInfo(args[0]);
			}catch (RestClientException e) {
				log.error("Rest Client Exception occured: "+e.getMessage());
				System.exit(2);
			}
			
			for(City city: cities)
			 log.info(city.toString());
			
			try{
			     fileWriter.writeLocations(cities);
			}catch(IOException e)
			{
				log.error("IO Exception occurred: "+e.getMessage());
				System.exit(3);
			}
		};
	}
}