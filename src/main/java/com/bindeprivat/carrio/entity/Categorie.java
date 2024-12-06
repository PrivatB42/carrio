package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Categorie {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int IdCategorie;

    @Column(length = 25)
    private String libelleCategorie;

}
