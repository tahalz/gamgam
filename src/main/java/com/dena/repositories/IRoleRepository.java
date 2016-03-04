package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dena.entities.Role;

public interface IRoleRepository extends JpaRepository<Role, Long> {

}
