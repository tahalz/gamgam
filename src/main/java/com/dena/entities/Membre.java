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

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="Membre")
public class Membre implements Serializable {
	

	public Membre() {
	}
	
	@Column(name="idMembre", nullable=false, unique=true, length=19)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idMembre;
	
	@Column(name="nomMembre", nullable=true, length=255)	
	private String nomMembre;
	
	@Column(name="prenomMembre", nullable=true, length=255)	
	private String prenomMembre;
	
	@Column(name="password", nullable=true, length=255)	
	private String password;
	
	@Column(name="email", nullable=true, length=255)	
	private String email;
	
	@Column(name="civilite", nullable=true, length=255)	
	private String civilite;
	
	public Membre(String nomMembre, String prenomMembre, String password, String email, String civilite, Boolean sexe) {
		super();
		this.nomMembre = nomMembre;
		this.prenomMembre = prenomMembre;
		this.password = password;
		this.email = email;
		this.civilite = civilite;
		this.sexe = sexe;
	}

	@Column(name="sexe", nullable=true, length=1)	
	private Boolean sexe;
	
	@OneToOne(mappedBy="membre", fetch=FetchType.LAZY)	
	private Role role;
	
	@OneToOne(mappedBy="membre",  fetch=FetchType.LAZY)	
	private Abonnement abonnement;
	
	@OneToMany(mappedBy="membre", fetch=FetchType.LAZY)	
	@JsonIgnore
	private Collection<CV> cvs ;
	
	@OneToMany(mappedBy="membre", fetch=FetchType.LAZY)		
	@JsonIgnore
	private Collection<LettreMotivation> lettreMotivations;
	
	@OneToOne(mappedBy="membre",  fetch=FetchType.LAZY)	
	private CarteVisite carteVisite;
	
	@OneToMany(mappedBy="membre", fetch=FetchType.LAZY)	
	@JsonIgnore
	private Collection<Mail> mails;
	
	@OneToMany(mappedBy="membre", fetch=FetchType.LAZY)	
	@JsonIgnore
	private Collection<Notification> notifications ;
	
	public Collection<CV> getCvs() {
		return cvs;
	}

	public void setCvs(Collection<CV> cvs) {
		this.cvs = cvs;
	}

	public Collection<LettreMotivation> getLettreMotivations() {
		return lettreMotivations;
	}

	public void setLettreMotivations(Collection<LettreMotivation> lettreMotivations) {
		this.lettreMotivations = lettreMotivations;
	}

	public Collection<Mail> getMails() {
		return mails;
	}

	public void setMails(Collection<Mail> mails) {
		this.mails = mails;
	}

	public Collection<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(Collection<Notification> notifications) {
		this.notifications = notifications;
	}

	public long getIdMembre() {
		return idMembre;
	}
	

	
	public void setNomMembre(String value) {
		this.nomMembre = value;
	}
	
	public String getNomMembre() {
		return nomMembre;
	}
	
	public void setPrenomMembre(String value) {
		this.prenomMembre = value;
	}
	
	public String getPrenomMembre() {
		return prenomMembre;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setCivilite(String value) {
		this.civilite = value;
	}
	
	public String getCivilite() {
		return civilite;
	}
	

	
	public void setSexe(Boolean sexe) {
		this.sexe = sexe;
	}

	public Boolean getSexe() {
		return sexe;
	}
	
	public void setRole(Role value) {
		this.role = value;
	}
	
	public Role getRole() {
		return role;
	}
	
	public void setAbonnement(Abonnement value) {
		this.abonnement = value;
	}
	
	public Abonnement getAbonnement() {
		return abonnement;
	}
	
	
	
	
	public void setCarteVisite(CarteVisite value) {
		this.carteVisite = value;
	}
	
	public CarteVisite getCarteVisite() {
		return carteVisite;
	}
	
	
	
	public String toString() {
		return String.valueOf(getIdMembre());
	}
	
}
