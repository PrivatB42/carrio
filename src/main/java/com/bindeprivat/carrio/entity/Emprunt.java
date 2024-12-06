package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
public class Emprunt {

    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String DateEmprunt;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private String DateRetour;

    @Column(name="etat")
    private Boolean etat;

    @ManyToOne
    @JoinColumn(name="etudiant_id")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name="exemplaire_id")
    private Exemplaire Exemplaire;

}