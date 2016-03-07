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
@Table(name="Role")
public class Role implements Serializable {
	

	public Role() {
	}
	
	@Column(name="idRole", nullable=false, unique=true, length=19)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idRole;
	
	@Column(name="typeRole", nullable=true, length=255)	
	private String typeRole;
	
	public Role(String typeRole) {
		super();
		this.typeRole = typeRole;
	}

	@OneToOne( fetch=FetchType.LAZY)	
	@PrimaryKeyJoinColumn
	private Membre membre;
	
	public long getIdRole() {
		return idRole;
	}

	public void setTypeRole(String value) {
		this.typeRole = value;
	}
	
	public String getTypeRole() {
		return typeRole;
	}
	
	public void setMembre(Membre value) {
		this.membre = value;
	}
	
	public Membre getMembre() {
		return membre;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", typeRole=" + typeRole + ", membre=" + membre + "]";
	}
	

	
}
