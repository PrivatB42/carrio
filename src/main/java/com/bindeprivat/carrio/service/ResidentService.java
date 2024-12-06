package com.bindeprivat.carrio.service;

import com.bindeprivat.carrio.Repository.ResidentRepository;
import com.bindeprivat.carrio.entity.Resident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResidentService {

    @Autowired
    private ResidentRepository repo;

    public void SaveResident(Resident resident){
        repo.save(resident);
    }

    public List<Resident> AllResident(){
        return repo.findAll();
    }

    public Resident GetResident(int id){
        Optional<Resident> resident = Optional.of(repo.findById(id).orElseThrow());
        return resident.get();
    }

    public void DeleteResident(int id){
        repo.deleteById(id);
    }



}
