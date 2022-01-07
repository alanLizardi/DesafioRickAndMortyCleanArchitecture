package cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.mapper;

import org.springframework.stereotype.Component;

import cl.mobdev.challenge.cleanarchitecture.domain.model.CharacterAndLocationResponse;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Character;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Location;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.OriginAndLocation;

@Component
public class CharacterMapper {

	public CharacterAndLocationResponse characterResponseBuild(Character character, Location location) {
		CharacterAndLocationResponse resp = new CharacterAndLocationResponse();
		resp.setId(character.getId());
		resp.setName(character.getName());
		resp.setStatus(character.getStatus());
		resp.setSpecies(character.getSpecies());
		resp.setType(character.getType());
		resp.setEpisode_count(character.getEpisode().size());
		resp.setOrigin(originResponseBuild(character, location));
		return resp;
	}

	public OriginAndLocation originResponseBuild(Character character, Location location) {
		OriginAndLocation originAndLocation = new OriginAndLocation();
		originAndLocation.setName(character.getOrigin().getName());
		originAndLocation.setUrl(character.getOrigin().getUrl());
		originAndLocation.setDimension(location.getDimension());
		originAndLocation.setResidents(location.getResidents());
		return originAndLocation;
	}
}
