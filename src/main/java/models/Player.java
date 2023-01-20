package models;

import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player {
@Id
    @GeneratedValue
    @Column
    private Long id;


}
