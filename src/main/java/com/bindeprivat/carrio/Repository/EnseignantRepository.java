package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantRepository extends JpaRepository<Enseignant, Integer> {
}
