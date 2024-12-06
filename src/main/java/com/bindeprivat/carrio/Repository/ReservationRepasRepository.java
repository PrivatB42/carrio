package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.ReservationRepas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepasRepository extends JpaRepository<ReservationRepas, Integer> {
}
