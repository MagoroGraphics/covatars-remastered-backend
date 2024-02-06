package covatars.com.Covatars.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name="players")
public class Player {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private Long id;

@Column
    private String name;

@Column
    private Integer score;

@Column
    private ArrayList<Card> cardsInHand;

@Column
    private ArrayList<Card> cardsOnBoard;

public Player(){

}

    public Player(String name, Integer score, ArrayList<Card> cardsInHand, ArrayList<Card>  cardsOnBoard) {
        this.name = name;
        this.score = score;
        this.cardsInHand = cardsInHand;
        this.cardsOnBoard = cardsOnBoard;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public ArrayList<Card> getCardsOnBoard() {
        return cardsOnBoard;
    }

    public void setCardsOnBoard(ArrayList<Card> cardsOnBoard) {
        this.cardsOnBoard = cardsOnBoard;
    }

    public ArrayList<Card> getCardsInHand() {
        return cardsInHand;
    }

    public void setCardsInHand(ArrayList<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }
}
