package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Exemplaire {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idExemplaire;

  /*  @Column(name="photo")
    private String Photo;*/
    @Column(length = 15)
    private String langueExemplaire;

    @Column(length = 15)
    private int prixEmplaire;

    @Column(length = 15)
    private int nbreExemplaire;

    @ManyToOne
    @JoinColumn(name = "livre_id")
    private Livre livre;

}