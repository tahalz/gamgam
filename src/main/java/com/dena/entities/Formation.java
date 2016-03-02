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
@Table(name = "Formation")
public class Formation implements Serializable {
	

	public Formation() {
	}

	@Column(name = "idFormation", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idFormation;

	@Column(name = "nomFormation", nullable = true, length = 255)
	private String nomFormation;

	@Column(name = "etablissement", nullable = true, length = 255)
	private String etablissement;

	@Column(name = "description", nullable = true, length = 255)
	private String description;

	@Column(name = "dateDebut", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateDebut;

	@Column(name = "dateFin", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateFin;

	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;

	public long getIdFormation() {
		return idFormation;
	}

	public long getORMID() {
		return getIdFormation();
	}

	public void setNomFormation(String value) {
		this.nomFormation = value;
	}

	public String getNomFormation() {
		return nomFormation;
	}

	public void setEtablissement(String value) {
		this.etablissement = value;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public String getDescription() {
		return description;
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

	public void setLangue(Langue value) {
		this.langue = value;
	}

	public Langue getLangue() {
		return langue;
	}

	public String toString() {
		return String.valueOf(getIdFormation());
	}

}
