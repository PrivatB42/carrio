package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Resident;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentRepository extends JpaRepository<Resident, Integer> {
}
