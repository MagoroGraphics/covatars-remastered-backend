package models;

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
    private ArrayList<Card> cards;

public Player(){

}

    public Player(String name, Integer score, ArrayList<Card> cards) {
        this.name = name;
        this.score = score;
        this.cards = cards;
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

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
