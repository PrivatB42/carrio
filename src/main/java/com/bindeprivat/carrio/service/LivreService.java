package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.LivreRepository;
import com.bindeprivat.carrio.entity.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivreService {

    @Autowired
    private LivreRepository repo;

    public void SaveLivre(Livre livre){
        repo.save(livre);
    }

    public List<Livre> AllLivre(){
        return repo.findAll();
    }

    public Livre GetLivre(int id){
        Optional<Livre> livre = Optional.of(repo.findById(id).orElseThrow());
        return livre.get();
    }

    public void DeleteLivre(int id){
        repo.deleteById(id);
    }

}
