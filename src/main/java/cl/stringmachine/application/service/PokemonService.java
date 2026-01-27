package cl.stringmachine.application.service;

import cl.stringmachine.application.repository.model.Pokemon;

import java.util.List;

public interface PokemonService {

    List<Pokemon> findAll();
}
