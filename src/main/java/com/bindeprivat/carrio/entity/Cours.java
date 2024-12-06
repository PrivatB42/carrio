package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;

    @Column(length = 20)
    private String nomCours;

    @Column(length = 20)
    private String codeCours;

    @Column(length = 10)
    private int creditCours;


}
