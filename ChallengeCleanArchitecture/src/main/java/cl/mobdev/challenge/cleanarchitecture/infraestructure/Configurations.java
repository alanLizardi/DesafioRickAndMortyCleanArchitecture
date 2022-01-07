package cl.mobdev.challenge.cleanarchitecture.infraestructure;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configurations {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}