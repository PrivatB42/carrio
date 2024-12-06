package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.InscriptionEvenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionEvenementRepository extends JpaRepository<InscriptionEvenement, Integer> {
}
