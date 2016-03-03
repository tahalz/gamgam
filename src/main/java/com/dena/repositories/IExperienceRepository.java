package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.Experience;

public interface IExperienceRepository extends JpaRepository<Experience, Long> {

}
