package models;

import jakarta.persistence.*;

@Entity
@Table(name="players")
public class Player {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable=false)
    private Long id;

@Column
    private String name;


}
