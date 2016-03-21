package com.dena.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.Membre;
import java.lang.String;

public interface IMembreRepository extends JpaRepository<Membre, Long>{ 
	List<Membre> findBySexe(Boolean sexe);
	List<Membre> findByCivilite(String civilite);
	List<Membre> findByEmail(String email);
	List<Membre> findByResetPasswordToken(String resetpasswordtoken);
	

}
