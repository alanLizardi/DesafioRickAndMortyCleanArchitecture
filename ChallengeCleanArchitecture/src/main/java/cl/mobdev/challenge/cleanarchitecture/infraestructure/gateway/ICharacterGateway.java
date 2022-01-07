package cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway;

import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Character;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Location;

public interface ICharacterGateway {
	
	public Character getCharacterById(int id);
	
	public Location getLocationByUrl(String url);
}
