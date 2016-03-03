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
@Table(name="Competence")
public class Competence implements Serializable {


	public Competence() {
	}
	
	@Column(name="idCompetence", nullable=false, unique=true, length=19)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idCompetence;
	
	@Column(name="typeCompetence", nullable=true, length=255)	
	private String typeCompetence;
	
	@Column(name="domaineCompetence", nullable=true, length=255)	
	private String domaineCompetence;
	
	@Column(name="description", nullable=true, length=255)	
	private String description;
	
	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;
	

	
	public long getIdCompetence() {
		return idCompetence;
	}
	
	public long getORMID() {
		return getIdCompetence();
	}
	
	public void setTypeCompetence(String value) {
		this.typeCompetence = value;
	}
	
	public String getTypeCompetence() {
		return typeCompetence;
	}
	
	public void setDomaineCompetence(String value) {
		this.domaineCompetence = value;
	}
	
	public String getDomaineCompetence() {
		return domaineCompetence;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setLangue(Langue value) {
		this.langue = value;
	}
	
	public Langue getLangue() {
		return langue;
	}
	
	public String toString() {
		return String.valueOf(getIdCompetence());
	}
	
}