package covatars.com.Covatars.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private Long id;

    @Column
    private String type;

    @Column
    private String color;

    @Column
    private String imageUrl;

    @Column
    private Integer value;

    public Card() {
    }

    public Card(String type, String color, String imageUrl, Integer value) {
        this.type = type;
        this.color = color;
        this.imageUrl = imageUrl;
        this.value = value;
    }

    //region Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    //endregion
}
