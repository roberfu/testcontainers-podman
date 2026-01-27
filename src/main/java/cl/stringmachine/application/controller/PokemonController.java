package cl.stringmachine.application.controller;

import cl.stringmachine.application.repository.model.Pokemon;
import cl.stringmachine.application.service.PokemonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping
    List<Pokemon> findAll() {
        return service.findAll();
    }
}
