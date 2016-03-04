package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.Paiement;

public interface IPaiementRepository extends JpaRepository<Paiement, Long>{

}
