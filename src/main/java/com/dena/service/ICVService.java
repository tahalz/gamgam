package com.dena.service;

import java.util.List;

import com.dena.entities.CV;



public interface ICVService {
	public CV save(CV ex) ;
	public List<CV> findAll() ;
	public CV findById(long id) ;
	public void delete(long id) ;
	public CV update(long id,CV competence);

}
