package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ReservationRepas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservation;

    @Column(length = 15)
    private String dateReservation;

    @OneToOne
    @JoinColumn(name = "etudiantId")
    private Etudiant etudiant;

    @OneToMany
    @JoinColumn(name = "repasId")
    private List<Repas> repas;

}
