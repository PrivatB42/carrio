package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivre;

    @Column(length=35)
    private String titreLivre;

    @Column(length = 15)
    private String dateDeParution;

    @Column(length = 45)
    private String nomAuteur;

    @Column(length = 10)
    private int nbreExemplaire;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;





}
