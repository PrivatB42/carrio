package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {
}
