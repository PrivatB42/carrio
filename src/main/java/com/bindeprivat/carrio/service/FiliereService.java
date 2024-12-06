package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.FiliereRepository;
import com.bindeprivat.carrio.entity.Filiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FiliereService {

    @Autowired
    private FiliereRepository repo;

    public void SaveFiliere(Filiere filiere){
        repo.save(filiere);
    }

    public List<Filiere> AllFiliere(){
        return repo.findAll();
    }

    public Filiere GetFiliere(int id){
        Optional<Filiere> filiere = Optional.of(repo.findById(id).orElseThrow());
        return filiere.get();
    }

    public void DeleteFiliere(int id){
        repo.deleteById(id);
    }
    
}
