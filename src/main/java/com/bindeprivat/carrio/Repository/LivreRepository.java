package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Integer> {
}
