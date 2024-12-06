package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEvenement;

    @Column(length = 20)
    private String nomEvenement;

    @Column(length =15)
    private String dateEvenement;

    @Column(length = 20)
    private String lieuEvenement;

}
