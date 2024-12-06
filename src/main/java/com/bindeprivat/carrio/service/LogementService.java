package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.LogementRepository;
import com.bindeprivat.carrio.Repository.LogementRepository;
import com.bindeprivat.carrio.entity.Logement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogementService {
    
    @Autowired
    private LogementRepository repo;

    public void SaveLogement(Logement logement){
        repo.save(logement);
    }

    public List<Logement> AllLogement(){
        return repo.findAll();
    }

    public Logement GetLogement(int id){
        Optional<Logement> logement = Optional.of(repo.findById(id).orElseThrow());
        return logement.get();
    }

    public void DeleteLogement(int id){
        repo.deleteById(id);
    }
    
}
