package com.vente.vente.repositories;

import com.vente.vente.modeles.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {
}
