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
@Table(name = "Langue")
public class Langue implements Serializable {
	

	public Langue() {
	}

	@Column(name = "idLangue", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLangue;

	public Langue(String typeLangue) {
		super();
		this.typeLangue = typeLangue;
	}

	@Column(name = "typeLangue", nullable = true, length = 255)
	private String typeLangue;

	@ManyToOne
	@JoinColumn(name="CODE_CV")
	private CV cv;

	@OneToMany(mappedBy = "langue",fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<Competence> competences;

	@OneToMany(mappedBy = "langue",fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<Formation> formations;

	@OneToMany(mappedBy = "langue", fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<Loisir> loisirs;

	@OneToMany(mappedBy = "langue", fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<Experience> experiences;

	@OneToMany(mappedBy = "langue", fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<Lien> liens;

	@OneToMany(mappedBy = "langue", fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<TypeCV> typeCVs;

	@OneToMany(mappedBy = "langue", fetch=FetchType.LAZY)
    @JsonIgnore
	private Collection<Portfolio> portfolios;

	@OneToOne(mappedBy = "langue",  fetch = FetchType.LAZY)
	private InformationPersonnel informationPersonnel;

	public long getIdLangue() {
		return idLangue;
	}



	public void setTypeLangue(String value) {
		this.typeLangue = value;
	}

	public String getTypeLangue() {
		return typeLangue;
	}

	public void setCv(CV value) {
		this.cv = value;
	}

	public CV getCv() {
		return cv;
	}

	public Collection<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Collection<Competence> competences) {
		this.competences = competences;
	}

	public Collection<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Collection<Formation> formations) {
		this.formations = formations;
	}

	public Collection<Loisir> getLoisirs() {
		return loisirs;
	}

	public void setLoisirs(Collection<Loisir> loisirs) {
		this.loisirs = loisirs;
	}

	public Collection<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(Collection<Experience> experiences) {
		this.experiences = experiences;
	}

	public Collection<Lien> getLiens() {
		return liens;
	}

	public void setLiens(Collection<Lien> liens) {
		this.liens = liens;
	}

	public Collection<TypeCV> getTypeCVs() {
		return typeCVs;
	}

	public void setTypeCVs(Collection<TypeCV> typeCVs) {
		this.typeCVs = typeCVs;
	}

	public Collection<Portfolio> getPortfolios() {
		return portfolios;
	}

	public void setPortfolios(Collection<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}

	public void setInformationPersonnel(InformationPersonnel value) {
		this.informationPersonnel = value;
	}

	public InformationPersonnel getInformationPersonnel() {
		return informationPersonnel;
	}

	public String toString() {
		return String.valueOf(getIdLangue());
	}

}
