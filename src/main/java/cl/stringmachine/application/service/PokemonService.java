package cl.stringmachine.application.service;

import cl.stringmachine.application.service.dto.PokemonDTO;

import java.util.List;

public interface PokemonService {

    List<PokemonDTO> findAll();
}
