package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.EnseignantRepository;
import com.bindeprivat.carrio.entity.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    
    @Autowired
    private EnseignantRepository repo;

    public void SaveEnseignant(Enseignant Enseignant){
        repo.save(Enseignant);
    }

    public List<Enseignant> AllEnseignant(){
        return repo.findAll();
    }

    public Enseignant GetEnseignant(int id){
        Optional<Enseignant> Enseignant = Optional.of(repo.findById(id).orElseThrow());
        return Enseignant.get();
    }

    public void DeleteEnseignant(int id){
        repo.deleteById(id);
    }
    
    
}
