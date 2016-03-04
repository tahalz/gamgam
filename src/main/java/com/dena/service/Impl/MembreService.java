package com.dena.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dena.entities.Membre;
import com.dena.repositories.IMembreRepository;
import com.dena.service.IMembreService;


@Service
@Transactional
public class MembreService implements IMembreService{

	@Autowired
	private IMembreRepository membreRepository ;
	
	

	@Override
	public Membre save(Membre membre) {
		// TODO Auto-generated method stub
		return membreRepository.save(membre);
	}

	@Override
	public List<Membre> findAll() {
		// TODO Auto-generated method stub
		return membreRepository.findAll();
	}

	@Override
	public Membre findById(long id) {
		// TODO Auto-generated method stub
		return membreRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		membreRepository.delete(id);
		
	}

	



	public IMembreRepository getMembreRepository() {
		return membreRepository;
	}

	public void setMembreRepository(IMembreRepository membreRepository) {
		this.membreRepository = membreRepository;
	}

	@Override
	public Membre update(long id,Membre membre) {
		Membre x=membreRepository.findOne(id);
		x.setCivilite(membre.getCivilite());
		x.setEmail(membre.getEmail());
		x.setNomMembre(membre.getNomMembre());
		x.setPassword(membre.getPassword());
		x.setPrenomMembre(membre.getPrenomMembre());
		x.setSexe(membre.getSexe());
		return membreRepository.save(x);
	}
	
}
