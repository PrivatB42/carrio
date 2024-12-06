package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Logement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LogementRepository extends JpaRepository<Logement, Integer> {
}
