package com.dena.service;

import java.util.List;

import com.dena.entities.LettreMotivation;

public interface ILettreMotivationService {
	public LettreMotivation save(LettreMotivation lettreMotivation) ;
	public List<LettreMotivation> findAll() ;
	public LettreMotivation findById(long id) ;
	public void delete(long id) ;
	public LettreMotivation update(long id ,LettreMotivation lettreMotivation);
}
