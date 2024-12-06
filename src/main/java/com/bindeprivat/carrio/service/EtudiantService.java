package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.EtudiantRepository;
import com.bindeprivat.carrio.entity.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository repo;


    public void SaveEtudiant(Etudiant etudiant){
        repo.save(etudiant);
    }

    public List<Etudiant> AllEtudiant(){
        return repo.findAll();
    }

    public Etudiant GetEtudiant(int id){
        Optional<Etudiant> etudiant = Optional.of(repo.findById(id).orElseThrow());
        return etudiant.get();
    }

    public void DeleteEtudiant(int id){
        repo.deleteById(id);
    }




}
