package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Resident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResident;

    @Column(length = 20)
    private String date_debutResidence;

    @OneToOne
    @JoinColumn(name = "etudiantId")
    private Etudiant etudiant;

    @OneToOne
    @JoinColumn(name = "logement")
    private Logement logement;

}
