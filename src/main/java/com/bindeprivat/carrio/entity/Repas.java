package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Repas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRepas;

    @Column(length = 20)
    private String nomRepas;

    @Column(length = 10)
    private float coutRepas;


}
