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
import javax.persistence.*;

@Entity
@Table(name = "Experience")
public class Experience implements Serializable {
	

	public Experience() {
	}

	@Column(name = "idExperience", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idExperience;

	@Column(name = "poste", nullable = true, length = 255)
	private String poste;

	@Column(name = "entreprise", nullable = true, length = 255)
	private String entreprise;

	@Column(name = "logo", nullable = true, length = 10)
	private Integer logo;

	@Column(name = "typeContrat", nullable = true, length = 255)
	private String typeContrat;

	@Column(name = "dateDebut", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateDebut;

	@Column(name = "dateFin", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateFin;

	@Column(name = "ville", nullable = true, length = 255)
	private String ville;

	@Column(name = "pays", nullable = true, length = 255)
	private String pays;

	@Column(name = "mission", nullable = true, length = 255)
	private String mission;

	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;

	public long getIdExperience() {
		return idExperience;
	}

	public long getORMID() {
		return getIdExperience();
	}

	public void setPoste(String value) {
		this.poste = value;
	}

	public String getPoste() {
		return poste;
	}

	public void setEntreprise(String value) {
		this.entreprise = value;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setLogo(int value) {
		setLogo(new Integer(value));
	}

	public void setLogo(Integer value) {
		this.logo = value;
	}

	public Integer getLogo() {
		return logo;
	}

	public void setTypeContrat(String value) {
		this.typeContrat = value;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setDateDebut(java.util.Date value) {
		this.dateDebut = value;
	}

	public java.util.Date getDateDebut() {
		return dateDebut;
	}

	public void setDateFin(java.util.Date value) {
		this.dateFin = value;
	}

	public java.util.Date getDateFin() {
		return dateFin;
	}

	public void setVille(String value) {
		this.ville = value;
	}

	public String getVille() {
		return ville;
	}

	public void setPays(String value) {
		this.pays = value;
	}

	public String getPays() {
		return pays;
	}

	public void setMission(String value) {
		this.mission = value;
	}

	public String getMission() {
		return mission;
	}

	public void setLangue(Langue value) {
		this.langue = value;
	}

	public Langue getLangue() {
		return langue;
	}

	public String toString() {
		return String.valueOf(getIdExperience());
	}

}