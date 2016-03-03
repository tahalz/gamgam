package com.dena.entities;
/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.*;
@Table(name="Abonnement")
@Entity
public class Abonnement implements Serializable {




	public Abonnement() {
	}
	
	@Column(name="idAbonnement", nullable=false, unique=true, length=19)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idAbonnement;
	
	@Column(name="typeAbonnement", nullable=true, length=1)	
	private Integer typeAbonnement;
	
	@OneToOne( fetch=FetchType.LAZY)	
	@PrimaryKeyJoinColumn
	private Membre membre;
	
	@OneToMany(mappedBy="abonnement", fetch=FetchType.LAZY)	
	
	private Collection<Paiement> paiements ;
	

	
	public long getIdAbonnement() {
		return idAbonnement;
	}
	
	public long getORMID() {
		return getIdAbonnement();
	}
	
	public void setTypeAbonnement(int value) {
		setTypeAbonnement(new Integer(value));
	}
	
	public void setTypeAbonnement(Integer value) {
		this.typeAbonnement = value;
	}
	
	public Integer getTypeAbonnement() {
		return typeAbonnement;
	}
	
	public void setMembre(Membre value) {
		this.membre = value;
	}
	
	public Membre getMembre() {
		return membre;
	}
	
	
	
	
	public Collection<Paiement> getPaiements() {
		return paiements;
	}

	public void setPaiements(Collection<Paiement> paiements) {
		this.paiements = paiements;
	}

	public String toString() {
		return String.valueOf(getIdAbonnement());
	}
	
}