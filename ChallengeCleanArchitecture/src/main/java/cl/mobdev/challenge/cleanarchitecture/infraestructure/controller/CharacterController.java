package cl.mobdev.challenge.cleanarchitecture.infraestructure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cl.mobdev.challenge.cleanarchitecture.aplication.usecase.IGetCharacterByIdUseCase;
import cl.mobdev.challenge.cleanarchitecture.domain.model.CharacterAndLocationResponse;

@RestController
@RequestMapping("/v1")
public class CharacterController {

	private RestController RestController;

	private IGetCharacterByIdUseCase iGetCharacterByIdUseCase;

	private CharacterController(IGetCharacterByIdUseCase iGetCharacterByIdUseCase) {
		this.iGetCharacterByIdUseCase = iGetCharacterByIdUseCase;
	}

	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/character/{id}")
	public CharacterAndLocationResponse getCharacterById(@PathVariable(value = "id") int id) {
		CharacterAndLocationResponse character = iGetCharacterByIdUseCase.getCharacterById(id);
		return character;
	}

}
