package com.dena.service;

import java.util.List;

import com.dena.entities.TypeCV;

public interface ITypeCVService {

      	public TypeCV save(TypeCV typeCV) ;
		public List<TypeCV> findAll() ;
		public TypeCV findById(long id) ;
		public void delete(long id) ;
		public TypeCV update(long id,TypeCV typeCV);
	}

