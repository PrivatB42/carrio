package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class InscriptionEvenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInscriptionEvenement;

    @ManyToOne
    @JoinColumn(name = "etudiantId")
    private Etudiant etudiant;

    @OneToOne
    @JoinColumn(name = "evenement")
    private Evenement evenement;

}
