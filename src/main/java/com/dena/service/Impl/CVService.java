package com.dena.service.Impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dena.entities.CV;
import com.dena.entities.Experience;
import com.dena.service.ICVService;
import com.dena.repositories.ICVRepository;


@Service
@Transactional
public class CVService implements ICVService{

	@Autowired
	private ICVRepository cvRepository ;
	
	

	@Override
	public CV save(CV ex) {
		// TODO Auto-generated method stub
		return cvRepository.save(ex);
	}

	@Override
	public List<CV> findAll() {
		// TODO Auto-generated method stub
		return cvRepository.findAll();
	}

	@Override
	public CV findById(long id) {
		// TODO Auto-generated method stub
		return cvRepository.findOne(id);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		cvRepository.delete(id);
		
	}
	public ICVRepository getExperienceRepository() {
		return cvRepository;
	}

	public void setExperienceRepository(ICVRepository experienceRepository) {
		this.cvRepository = experienceRepository;
	}
	

	
	@Override
	public CV update(long id,CV cv) {
		CV x=cvRepository.findOne(id);
		x.setPhoto(cv.getPhoto());
		x.setDateNaissance(cv.getDateNaissance());
		x.setVille(cv.getVille());
		x.setCodePostal(cv.getCodePostal());
		x.setPays(cv.getPays());
		x.setPermis(cv.getPermis());
		x.setSituationProfessionnel(cv.getSituationProfessionnel());
		x.setSituationFamilial(cv.getSituationFamilial());
		return cvRepository.save(x);
	}
}


