package com.dena.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dena.entities.Competence;
import com.dena.service.ICompetenceService ;

@Service
@Transactional
public class CompetenceService implements ICompetenceService{

	@Override
	public Competence save(Competence ex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Competence> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Competence findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Competence update(long id, Competence competence) {
		// TODO Auto-generated method stub
		return null;
	}

}
