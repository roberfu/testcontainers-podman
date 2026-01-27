package cl.stringmachine.application.service.impl;

import cl.stringmachine.application.repository.PokemonRepository;
import cl.stringmachine.application.service.PokemonService;
import cl.stringmachine.application.service.dto.PokemonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    private final PokemonRepository repository;

    public PokemonServiceImpl(PokemonRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public List<PokemonDTO> findAll() {
        return repository.findAll().stream()
                .map(p -> new PokemonDTO(p.getName(), p.getNumber())).toList();
    }
}
