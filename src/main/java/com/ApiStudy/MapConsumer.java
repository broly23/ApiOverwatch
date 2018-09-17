package com.ApiStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.ApiStudy.Map.Map;
import com.ApiStudy.Map.MapBean;
import com.ApiStudy.Map.MapBoot;

@Configuration
public class MapConsumer {
	
	private static final String endpoint = "https://overwatch-api.net/api/v1/map";

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	public MapBoot getMapBoot() {
		HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<MapBoot> resp = restTemplate().exchange(endpoint, HttpMethod.GET, entity, MapBoot.class);
		return resp.getBody();
	}
	
	public List<Map> getMaps(){
		List<Map> maps = new ArrayList<>();
		MapBoot mb = getMapBoot();
		for( MapBean mbean : mb.getData()) {
			String mapUrl = mbean.getUrl();
			HttpHeaders headers = new HttpHeaders();
	        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	        headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
	        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	        ResponseEntity<Map> resp = restTemplate().exchange(mapUrl, HttpMethod.GET,entity,Map.class);
			maps.add(resp.getBody());
		}
		return maps;
	}
}
