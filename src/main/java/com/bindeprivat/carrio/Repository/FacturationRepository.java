package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Facturation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturationRepository extends JpaRepository<Facturation, Integer> {
}
