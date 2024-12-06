package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.ExemplaireRepository;
import com.bindeprivat.carrio.entity.Exemplaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExemplaireService {

    @Autowired
    private ExemplaireRepository repo;


    public void SaveExemplaire(Exemplaire exemplaire){
        repo.save(exemplaire);
    }

    public List<Exemplaire> AllExemplaire(){
        return repo.findAll();
    }

    public Exemplaire GetExemplaire(int id){
        Optional<Exemplaire> exemplaire = Optional.of(repo.findById(id).orElseThrow());
        return exemplaire.get();
    }

    public void DeleteExemplaire(int id){
        repo.deleteById(id);
    }
}
