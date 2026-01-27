package cl.stringmachine.application.repository;

import cl.stringmachine.application.repository.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
