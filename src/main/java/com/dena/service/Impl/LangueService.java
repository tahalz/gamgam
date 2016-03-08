package com.dena.service.Impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dena.service.ILangueService;
import com.dena.repositories.IImageRepository;
import com.dena.repositories.ILangueRepository;
import com.dena.entities.Image;
import com.dena.entities.InformationPersonnel;
import com.dena.entities.Langue;



@Service
@Transactional
public class LangueService implements ILangueService {
	
	@Autowired
	private ILangueRepository langueRepository ;
	
	

	@Override
	public Langue save(Langue langue) {
		// TODO Auto-generated method stub
		return langueRepository.save(langue);
	}

	@Override
	public List<Langue> findAll() {
		// TODO Auto-generated method stub
		return langueRepository.findAll();
	}

	@Override
	public Langue findById(long id) {
		// TODO Auto-generated method stub
		return langueRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		langueRepository.delete(id);
		
	}

	

	public ILangueRepository getLangueRepository() {
		return langueRepository;
	}

	public void setLangueRepository(ILangueRepository langueRepository) {
		this.langueRepository = langueRepository ;
	}
	
	@Override
	public Langue update(long id,Langue langue) {
		Langue x=langueRepository.findOne(id);
		x.setCompetences(langue.getCompetences());
		x.setCv(langue.getCv());
		x.setExperiences(langue.getExperiences());
		x.setFormations(langue.getFormations());
		x.setInformationPersonnel(langue.getInformationPersonnel());
		x.setLiens(langue.getLiens());
		x.setLoisirs(langue.getLoisirs());
		x.setPortfolios(langue.getPortfolios());
		x.setTypeCVs(langue.getTypeCVs());
		x.setTypeLangue(langue.getTypeLangue());
		return langueRepository.save(x);
	}
	}



