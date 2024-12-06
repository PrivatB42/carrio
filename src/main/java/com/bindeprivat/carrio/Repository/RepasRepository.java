package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepasRepository extends JpaRepository<Repas, Integer> {
}
