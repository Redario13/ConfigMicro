package com.contrat.contrat.repositories;

import com.contrat.contrat.modeles.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
