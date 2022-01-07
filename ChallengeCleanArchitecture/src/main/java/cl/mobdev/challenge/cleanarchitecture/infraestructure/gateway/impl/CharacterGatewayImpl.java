package cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.ICharacterGateway;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Character;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Location;

@Repository
public class CharacterGatewayImpl implements ICharacterGateway {

	@Value("${url.character}")
	private String urlCharacter;
	
	private RestTemplate restTemplate;

	private CharacterGatewayImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public Character getCharacterById(int id) {
		return restTemplate.getForObject(urlCharacter + id, Character.class);
	}

	@Override
	public Location getLocationByUrl(String url) {
		return restTemplate.getForObject(url, Location.class);
	}

}
