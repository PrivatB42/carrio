package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Logement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLogement;

    @Column(length = 20)
    private String nomLogement;

    @Column(length =20)
    private String typeLogement;

    @Column(length =10)
    private float coutLoyer;

}
