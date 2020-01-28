package sideboard.wizard.cardservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sideboard.wizard.cardservice.entities.Card;

@Repository
public interface CardRepository extends CrudRepository<Card, Long> {
    
}
