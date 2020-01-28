package sideboard.wizard.cardservice.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sideboard.wizard.cardservice.entities.Card;

import java.util.Optional;

@SpringBootTest
public class CardRepositoryTests {

    @Autowired
    private CardRepository cardRepository;

    @Test
    public void createCardTest() {
        Card card = new Card();
        card.setName("Ajani's Pridemate");

        Card savedCard = cardRepository.save(card);

        Optional<Card> retrievedCard = cardRepository.findById(savedCard.getId());
        if(retrievedCard.isPresent()) {
            Assertions.assertEquals(card.getName(), retrievedCard.get().getName());
        }

    }
}
