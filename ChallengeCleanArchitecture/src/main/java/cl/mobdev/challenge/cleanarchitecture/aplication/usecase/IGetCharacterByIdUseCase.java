package cl.mobdev.challenge.cleanarchitecture.aplication.usecase;

import cl.mobdev.challenge.cleanarchitecture.domain.model.CharacterAndLocationResponse;

public interface IGetCharacterByIdUseCase {
	public CharacterAndLocationResponse getCharacterById(int id);
}
