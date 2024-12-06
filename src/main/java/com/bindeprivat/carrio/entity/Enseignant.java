package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnseignant;

    @Column(length = 20)
    private String nomEnseignant;

    @Column(length = 20)
    private String prenomEnseignant;

    @Column(length = 20)
    private String adresseEnseignant;

    @Column(length = 20)
    private String specialiteEnseignant;

    /*@OneToMany
    @JoinColumn(name = "Cours_Id")
    private List<Cours> cours;*/

}
