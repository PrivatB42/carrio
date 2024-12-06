package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Exemplaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExemplaireRepository extends JpaRepository<Exemplaire, Integer> {
}
