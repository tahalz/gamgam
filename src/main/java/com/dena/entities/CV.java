package com.dena.entities;
/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

import java.io.File;
/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "CV")
public class CV implements Serializable {


	public CV() {
	}

	@Column(name = "idCV", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCV;


	public CV(File photo, Date dateNaissance, String ville, String codePostal, String pays, Boolean permis,
			String situationProfessionnel, String situationFamilial) {
		super();
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.ville = ville;
		this.codePostal = codePostal;
		this.pays = pays;
		this.permis = permis;
		this.situationProfessionnel = situationProfessionnel;
		this.situationFamilial = situationFamilial;
	}

	@Column(name = "photo", nullable = true, length = 10)
	private File photo;

	@Column(name = "dateNaissance", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateNaissance;

	@Column(name = "ville", nullable = true, length = 255)
	private String ville;

	@Column(name = "codePostal", nullable = true, length = 255)
	private String codePostal;

	@Column(name = "pays", nullable = true, length = 255)
	private String pays;

	@Column(name = "permis", nullable = true)
	private Boolean permis;

	@Column(name = "situationProfessionnel", nullable = true, length = 255)
	private String situationProfessionnel;

	@ManyToOne( fetch = FetchType.LAZY)
	@JoinColumn(name="CODE_MEMBRE")
	private Membre membre;

	@Column(name = "situationFamilial", nullable = true, length = 255)
	private String situationFamilial;

	@OneToMany(mappedBy = "cv", fetch=FetchType.LAZY)
	private Collection<Langue> langues;

	@OneToMany(mappedBy = "cv",fetch=FetchType.LAZY)
	private Collection<FichierProfessionel> fichierProfessionel;

	public long getIdCV() {
		return idCV;
	}

	



	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public void setIdCV(long idCV) {
		this.idCV = idCV;
	}

	public void setDateNaissance(java.util.Date value) {
		this.dateNaissance = value;
	}

	public java.util.Date getDateNaissance() {
		return dateNaissance;
	}

	public void setVille(String value) {
		this.ville = value;
	}

	public String getVille() {
		return ville;
	}

	public void setCodePostal(String value) {
		this.codePostal = value;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setPays(String value) {
		this.pays = value;
	}

	public String getPays() {
		return pays;
	}



	public void setPermis(Boolean value) {
		this.permis = value;
	}

	public Boolean getPermis() {
		return permis;
	}

	public void setSituationProfessionnel(String value) {
		this.situationProfessionnel = value;
	}

	public String getSituationProfessionnel() {
		return situationProfessionnel;
	}

	public void setSituationFamilial(String value) {
		this.situationFamilial = value;
	}

	public String getSituationFamilial() {
		return situationFamilial;
	}

	public void setMembre(Membre value) {
		this.membre = value;
	}

	public Membre getMembre() {
		return membre;
	}

	public Collection<Langue> getLangues() {
		return langues;
	}

	public void setLangues(Collection<Langue> langues) {
		this.langues = langues;
	}

	public Collection<FichierProfessionel> getFichierProfessionel() {
		return fichierProfessionel;
	}

	public void setFichierProfessionel(Collection<FichierProfessionel> fichierProfessionel) {
		this.fichierProfessionel = fichierProfessionel;
	}

	public String toString() {
		return String.valueOf(getIdCV());
	}

}
