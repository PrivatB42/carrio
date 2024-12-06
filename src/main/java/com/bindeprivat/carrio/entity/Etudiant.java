package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int etudiantId;

    @Column(length = 20)
    private String nomEtudiant;

    @Column(length = 20)
    private String prenomEtudiant;

    @Column(length = 20)
    private String adresseEtudiant;

    @Column(length = 20)
    private String date_naissanceEtudiant;

}
