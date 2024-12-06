package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.CoursRepository;
import com.bindeprivat.carrio.entity.Cours;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoursService {
    
    @Autowired
    private CoursRepository repo;

    public void SaveCours(Cours cours){
        repo.save(cours);
    }

    public List<Cours> AllCours(){
        return repo.findAll();
    }

    public Cours GetCours(int id){
        Optional<Cours> cours = Optional.of(repo.findById(id).orElseThrow());
        return cours.get();
    }

    public void DeleteCours(int id){
        repo.deleteById(id);
    }
    
}
