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
import javax.persistence.*;
@Entity
@Table(name="Lien")
public class Lien implements Serializable {
	

	public Lien() {
	}
	
	@Column(name="idLiens", nullable=false, unique=true, length=19)	
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idLiens;
	
	@Column(name="service", nullable=true, length=255)	
	private String service;
	
	public Lien(String service, String url, File logo) {
		super();
		this.service = service;
		this.url = url;
		this.logo = logo;
	}

	@Column(name="url", nullable=true, length=255)	
	private String url;
	
	@Column(name="logo", nullable=true, length=10)	
	private File logo;
	
	@ManyToOne
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;
	
	public long getIdLiens() {
		return idLiens;
	}
	
	
	
	public void setService(String value) {
		this.service = value;
	}
	
	public String getService() {
		return service;
	}
	
	public void setUrl(String value) {
		this.url = value;
	}
	
	public String getUrl() {
		return url;
	}

	
	public void setLogo(File value) {
		this.logo = value;
	}
	
	public File getLogo() {
		return logo;
	}
	
	public void setLangue(Langue value) {
		this.langue = value;
	}
	
	public Langue getLangue() {
		return langue;
	}



	@Override
	public String toString() {
		return "Lien [idLiens=" + idLiens + ", service=" + service + ", url=" + url + ", logo=" + logo + ", langue="
				+ langue + "]";
	}
	
	
}
