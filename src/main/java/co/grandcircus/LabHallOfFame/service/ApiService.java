package co.grandcircus.LabHallOfFame.service;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import co.grandcircus.LabHallOfFame.entity.HallOfFameResponse;
import co.grandcircus.LabHallOfFame.entity.Innovator;
import co.grandcircus.LabHallOfFame.entity.Inventor;
	
	@Component // <- identify this as an autowirable Spring bean
	public class ApiService {
		
		private String API_KEY = "27f1a7a4f4294ffb97c774f67425d6a8";

		private RestTemplate restTemplate = new RestTemplate();
		
		// This is an instance initialization block. It runs when a new instance of the class is created--
		// right before the constructor.
		{
		    // This configures the restTemplateWithUserAgent to include a User-Agent header with every HTTP
			// request. Some of the APIs in this demo have a bug where User-Agent is required.
			ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
		        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
		        return execution.execute(request, body);
		    };
		    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
		}
		
		public List<Inventor> getPeople() {
			
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
			HallOfFameResponse response = restTemplate.getForObject(url, HallOfFameResponse.class);
			return response.getInventors();
		}
		
		public List<Innovator> getMakers() {
			
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
		
			HallOfFameResponse response = restTemplate.getForObject(url, HallOfFameResponse.class);
			return response.getInnovators();
		}
		
}
