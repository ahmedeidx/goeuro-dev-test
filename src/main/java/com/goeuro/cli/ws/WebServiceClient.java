package com.goeuro.cli.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.goeuro.cli.beans.City;

/**
 * REST web service client
 * @author ahmedeid
 * This class is an interface to the provided REST web service
 */
@ConfigurationProperties(prefix="webservice")
@Component
public class WebServiceClient {
	
	private static final Logger log = LoggerFactory.getLogger(WebServiceClient.class);
	
	@Autowired
	RestTemplate restTemplate;
	
	String url;
	
	/**
	 * Gets city information via REST web service
	 * @param city
	 * @return array of City bean
	 */
	public City[] getCityInfo(String city){
		log.info("calling web service: " + url + city);
		ResponseEntity<City[]> responseEntity = restTemplate.getForEntity( url + city, City[].class);
		City[] cities = responseEntity.getBody();
		return cities;
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}


	public RestTemplate getRestTemplate() {
		return restTemplate;
	}


	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
