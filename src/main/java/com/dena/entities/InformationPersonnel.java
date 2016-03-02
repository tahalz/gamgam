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
@Table(name = "InformationPersonnel")
public class InformationPersonnel implements Serializable {
	

	public InformationPersonnel() {
	}

	@Column(name = "idInfoPerso", nullable = false, unique = true, length = 20)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idInfoPerso;

	@Column(name = "presentation", nullable = true, length = 255)
	private String presentation;

	@Column(name = "motCle", nullable = true, length = 255)
	private String motCle;

	@Column(name = "titreCV", nullable = true, length = 255)
	private String titreCV;

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Langue langue;

	public long getIdInfoPerso() {
		return idInfoPerso;
	}

	public long getORMID() {
		return getIdInfoPerso();
	}

	public void setPresentation(String value) {
		this.presentation = value;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setMotCle(String value) {
		this.motCle = value;
	}

	public String getMotCle() {
		return motCle;
	}

	public void setTitreCV(String value) {
		this.titreCV = value;
	}

	public String getTitreCV() {
		return titreCV;
	}

	public void setLangue(Langue value) {
		this.langue = value;
	}

	public Langue getLangue() {
		return langue;
	}

	public String toString() {
		return String.valueOf(getIdInfoPerso());
	}

}
