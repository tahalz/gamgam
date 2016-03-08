package com.dena.service;


import java.util.List;

import com.dena.entities.InformationPersonnel;
import com.dena.entities.Langue;

public interface ILangueService {
 
	                    public Langue save(Langue ex) ;
						public List<Langue> findAll() ;
						public Langue findById(long id) ;
						public void delete(long id) ;
						public Langue update(long id,Langue langue);
				}

