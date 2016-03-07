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
@Table(name = "TypeCV")
public class TypeCV implements Serializable {


	public TypeCV() {
	}

	@Column(name = "idType", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idType;

	public TypeCV(String nomType) {
		super();
		this.nomType = nomType;
	}

	@Column(name = "nomType", nullable = true, length = 255)
	private String nomType;

	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;

	@OneToMany(mappedBy = "typeCV",fetch=FetchType.LAZY)
	@JsonIgnore
	private Collection<ThemeCV> themeCVs;

	public long getIdType() {
		return idType;
	}



	public void setNomType(String value) {
		this.nomType = value;
	}

	public String getNomType() {
		return nomType;
	}

	public void setLangue(Langue value) {
		this.langue = value;
	}

	public Langue getLangue() {
		return langue;
	}

	public Collection<ThemeCV> getThemeCVs() {
		return themeCVs;
	}

	public void setThemeCVs(Collection<ThemeCV> themeCVs) {
		this.themeCVs = themeCVs;
	}



	@Override
	public String toString() {
		return "TypeCV [idType=" + idType + ", nomType=" + nomType + ", langue=" + langue + ", themeCVs=" + themeCVs
				+ "]";
	}

	

}
