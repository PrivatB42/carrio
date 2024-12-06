package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Emprunt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpruntRepository extends JpaRepository<Emprunt, Integer> {

    List<Emprunt> getEmpruntByEtatFalse();

    List<Emprunt> getEmpruntByEtatTrue();

}
