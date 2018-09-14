package com.ApiStudy;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HeroConsumer {

	private static final String endpoint = "https://overwatch-api.net/api/v1/hero";
	
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	
	public List<Hero> getHero(){
		return null;
		
	}
}
