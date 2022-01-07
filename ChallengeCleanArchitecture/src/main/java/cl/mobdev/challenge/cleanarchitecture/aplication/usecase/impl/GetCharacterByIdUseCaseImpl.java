package cl.mobdev.challenge.cleanarchitecture.aplication.usecase.impl;

import org.springframework.stereotype.Service;

import cl.mobdev.challenge.cleanarchitecture.aplication.usecase.IGetCharacterByIdUseCase;
import cl.mobdev.challenge.cleanarchitecture.domain.model.CharacterAndLocationResponse;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.ICharacterGateway;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.mapper.CharacterMapper;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Location;
import cl.mobdev.challenge.cleanarchitecture.infraestructure.gateway.model.Character;

@Service
public class GetCharacterByIdUseCaseImpl implements IGetCharacterByIdUseCase {

	ICharacterGateway iRickAndMortyGateWay;
	CharacterMapper characterMapper;

	public GetCharacterByIdUseCaseImpl(ICharacterGateway iRickAndMortyGateWay, CharacterMapper characterMapper) {
		this.iRickAndMortyGateWay = iRickAndMortyGateWay;
		this.characterMapper = characterMapper;
	}

	@Override
	public CharacterAndLocationResponse getCharacterById(int id) {
		Character character = iRickAndMortyGateWay.getCharacterById(id);
		Location location = iRickAndMortyGateWay.getLocationByUrl(character.getLocation().getUrl());
		return characterMapper.characterResponseBuild(character, location);
	}

};
