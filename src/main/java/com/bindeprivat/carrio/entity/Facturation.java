package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Facturation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacture;

    @Column(length = 10)
    private int montant;

    @Column(length = 10)
    private String dateEmission;

    @Column(length = 10)
    private String status;

    @ManyToOne
    @JoinColumn(name = "etudiantId")
    private Etudiant etudiant;

}
