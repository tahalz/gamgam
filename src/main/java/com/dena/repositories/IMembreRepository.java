package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.Membre;

public interface IMembreRepository extends JpaRepository<Membre, Long>{

}
