package com.dena.service;

import java.util.List;

import com.dena.entities.Paiement;

public interface IPaiementService {
	public Paiement save(Paiement paiement) ;
	public List<Paiement> findAll() ;
	public Paiement findById(long id) ;
	public void delete(long id) ;
	public Paiement update(long id,Paiement paiement);
}
