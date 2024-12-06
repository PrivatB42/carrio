package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.InscriptionRepository;
import com.bindeprivat.carrio.entity.Inscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository repo;

    public void SaveInscription(Inscription inscription){repo.save(inscription);}

    public List<Inscription> AllInscription(){
        return repo.findAll();
    }

    public Inscription GetInscription(int id){
        Optional<Inscription> inscription = repo.findById(id);
        return inscription.orElseThrow();
    }
    public void DeleteInscription(int id){repo.deleteById(id);}

}
