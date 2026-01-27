package cl.stringmachine.application.service.impl;

import cl.stringmachine.application.repository.PokemonRepository;
import cl.stringmachine.application.repository.model.Pokemon;
import cl.stringmachine.application.service.PokemonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository repository;

    public PokemonServiceImpl(PokemonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Pokemon> findAll() {
        return (List<Pokemon>) repository.findAll();
    }
}
