package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Integer> {
}
