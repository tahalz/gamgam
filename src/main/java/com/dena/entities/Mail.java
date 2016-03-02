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
@Table(name = "mail")
public class Mail implements Serializable {
	

	public Mail() {
	}

	@Column(name = "idMail", nullable = false, unique = true, length = 10)
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idMail;

	@ManyToOne
	@JoinColumn(name="CODE_MEMBRE")
	private Membre membre;

	@Column(name = "contenu", nullable = true, length = 255)
	private String contenu;

	@Column(name = "dateEnvoi", nullable = true)
	@Temporal(TemporalType.DATE)
	private java.util.Date dateEnvoi;

	@Column(name = "email", nullable = true, length = 255)
	private String email;

	public int getIdMail() {
		return idMail;
	}

	public int getORMID() {
		return getIdMail();
	}

	public void setContenu(String value) {
		this.contenu = value;
	}

	public String getContenu() {
		return contenu;
	}

	public void setDateEnvoi(java.util.Date value) {
		this.dateEnvoi = value;
	}

	public java.util.Date getDateEnvoi() {
		return dateEnvoi;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public String getEmail() {
		return email;
	}

	public void setMembre(Membre value) {
		this.membre = value;
	}

	public Membre getMembre() {
		return membre;
	}

	public String toString() {
		return String.valueOf(getIdMail());
	}

}
