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
@Table(name="Loisir")
public class Loisir implements Serializable {
	

	public Loisir() {
	}
	
	@Column(name="idLoisir", nullable=false, unique=true, length=19)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idLoisir;
	
	public Loisir(String typeLoisr, String detaille) {
		super();
		this.typeLoisr = typeLoisr;
		this.detaille = detaille;
	}

	@Column(name="typeLoisr", nullable=true, length=255)	
	private String typeLoisr;
	
	@Column(name="detaille", nullable=true, length=255)	
	private String detaille;
	
	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")	
	private Langue langue;
	
	public long getIdLoisir() {
		return idLoisir;
	}
	

	
	public void setTypeLoisr(String value) {
		this.typeLoisr = value;
	}
	
	public String getTypeLoisr() {
		return typeLoisr;
	}
	
	public void setDetaille(String value) {
		this.detaille = value;
	}
	
	public String getDetaille() {
		return detaille;
	}
	
	public void setLangue(Langue value) {
		this.langue = value;
	}
	
	public Langue getLangue() {
		return langue;
	}



	@Override
	public String toString() {
		return "Loisir [idLoisir=" + idLoisir + ", typeLoisr=" + typeLoisr + ", detaille=" + detaille + ", langue="
				+ langue + "]";
	}
	

	
}
