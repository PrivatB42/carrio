package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Filiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFiliere;
    @Column(length = 7)
    private String sigl;
    @Column()
    private String nomFiliere;

}
