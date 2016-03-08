package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.CV;

public interface ICVRepository extends JpaRepository<CV, Long>  {

}
