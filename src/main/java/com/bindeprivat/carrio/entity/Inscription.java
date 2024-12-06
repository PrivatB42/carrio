package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInscription;

    @Column(length = 10)
    private String anneeAcademique;

    @ManyToOne
    @JoinColumn(name = "etudiantId")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "filiereId")
    private Filiere filiere;

}
