package com.bindeprivat.carrio.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Incident {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncident;

    @Column(length = 20)
    private String dateIncident;

    @Column(length = 100)
    private String descriptionIncident;

    @ManyToOne
    @JoinColumn(name = "residentId")
    private Resident resident;


}
