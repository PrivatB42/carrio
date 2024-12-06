package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.CategorieRepository;
import com.bindeprivat.carrio.entity.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService {
    
    @Autowired
    private CategorieRepository repo;

    public void SaveCategorie(Categorie categorie){
        repo.save(categorie);
    }

    public List<Categorie> AllCategorie(){
        return repo.findAll();
    }

    public Categorie GetCategorie(int id){
        Optional<Categorie> categorie = Optional.of(repo.findById(id).orElseThrow());
        return categorie.get();
    }

    public void DeleteCategorie(int id){
        repo.deleteById(id);
    }
    
}
