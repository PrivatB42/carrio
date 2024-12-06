package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
}
