package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.EmpruntRepository;
import com.bindeprivat.carrio.entity.Emprunt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpruntService {

    @Autowired
    private EmpruntRepository repository;

    public List<Emprunt> AllEmpruntDM(){
        return repository.getEmpruntByEtatFalse();
    }

    public List<Emprunt> AllEmpruntValid() {
        return repository.getEmpruntByEtatTrue();
    }

}
