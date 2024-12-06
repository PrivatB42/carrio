package com.bindeprivat.carrio.Repository;

import com.bindeprivat.carrio.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<Cours, Integer> {
}
