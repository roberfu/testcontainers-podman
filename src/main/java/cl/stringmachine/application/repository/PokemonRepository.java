package cl.stringmachine.application.repository;

import cl.stringmachine.application.repository.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
 
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
}
