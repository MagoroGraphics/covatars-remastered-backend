package covatars.com.Covatars.repositories;

import covatars.com.Covatars.models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}