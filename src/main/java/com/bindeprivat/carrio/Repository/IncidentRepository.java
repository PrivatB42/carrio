package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Incident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, Integer> {
}
