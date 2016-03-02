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

@Entity
@Table(name = "Portfolio")
public class Portfolio implements Serializable {
	

	public Portfolio() {
	}

	@Column(name = "idPortfolio", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPortfolio;

	@Column(name = "titrePortfolio", nullable = true, length = 255)
	private String titrePortfolio;

	@Column(name = "description", nullable = true, length = 255)
	private String description;

	@ManyToOne(targetEntity = Langue.class, fetch = FetchType.LAZY)
	@JoinColumn(name="CODE_LANGUE")
	private Langue langue;

	@OneToMany(mappedBy = "portfolio", fetch=FetchType.LAZY)

	private Collection<Video> videos;

	public Collection<Video> getVideos() {
		return videos;
	}

	public void setVideos(Collection<Video> videos) {
		this.videos = videos;
	}

	public Collection<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(Collection<Document> documents) {
		this.documents = documents;
	}

	public Collection<Image> getImages() {
		return images;
	}

	public void setImages(Collection<Image> images) {
		this.images = images;
	}

	public Collection<Audio> getAudios() {
		return audios;
	}

	public void setAudios(Collection<Audio> audios) {
		this.audios = audios;
	}

	public Collection<Diaporama> getDiaporamas() {
		return diaporamas;
	}

	public void setDiaporamas(Collection<Diaporama> diaporamas) {
		this.diaporamas = diaporamas;
	}

	@OneToMany(mappedBy = "portfolio", fetch=FetchType.LAZY)

	private Collection<Document> documents;

	@OneToMany(mappedBy = "potfolio",fetch=FetchType.LAZY)

	private Collection<Image> images;

	@OneToMany(mappedBy = "portfolio", fetch=FetchType.LAZY)
	private Collection<Audio> audios;

	@OneToMany(mappedBy = "portfolio", fetch=FetchType.LAZY)

	private Collection<Diaporama> diaporamas;

	public long getIdPortfolio() {
		return idPortfolio;
	}

	public long getORMID() {
		return getIdPortfolio();
	}

	public void setTitrePortfolio(String value) {
		this.titrePortfolio = value;
	}

	public String getTitrePortfolio() {
		return titrePortfolio;
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
		return String.valueOf(getIdPortfolio());
	}

}
