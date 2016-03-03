package com.dena.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dena.entities.Experience;
import com.dena.repositories.IExperienceRepository;
import com.dena.service.IExperienceService;

@Service
@Transactional
public class ExperienceService implements IExperienceService{

	@Autowired
	private IExperienceRepository experienceRepository ;
	
	

	@Override
	public Experience save(Experience ex) {
		// TODO Auto-generated method stub
		return experienceRepository.save(ex);
	}

	@Override
	public List<Experience> findAll() {
		// TODO Auto-generated method stub
		return experienceRepository.findAll();
	}

	@Override
	public Experience findById(long id) {
		// TODO Auto-generated method stub
		return experienceRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		experienceRepository.delete(id);
		
	}
	public IExperienceRepository getExperienceRepository() {
		return experienceRepository;
	}

	public void setExperienceRepository(IExperienceRepository experienceRepository) {
		this.experienceRepository = experienceRepository;
	}
}

