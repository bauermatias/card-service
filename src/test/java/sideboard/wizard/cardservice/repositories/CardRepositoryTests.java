package sideboard.wizard.cardservice.repositories;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sideboard.wizard.cardservice.entities.Card;

@SpringBootTest
public class CardRepositoryTests {

    @Autowired
    private CardRepository cardRepository;

    @Test
    public void createCardTest() {
        Card card = new Card();
        card.setName("Ajani's Pridemate");

        Card savedCard = cardRepository.save(card);
        //assertion savedCard.getId() != null

        cardRepository.findById(savedCard.getId());

    }
}
