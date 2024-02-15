package covatars.com.Covatars.controllers;
import covatars.com.Covatars.models.Card;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import covatars.com.Covatars.repositories.CardRepository;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardRepository cardRepository;

    public CardController(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @GetMapping
    public Iterable<Card> getAllCards() {
        return cardRepository.findAll();
    }
}

