package com.dena.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dena.entities.Portfolio ;

public interface IPortfolioRepository extends JpaRepository<Portfolio, Long>{


}
