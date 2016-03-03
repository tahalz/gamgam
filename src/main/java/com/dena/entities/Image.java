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
@Table(name = "Image")
public class Image implements Serializable {
	

	public Image() {
	}

	@Column(name = "idImage", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idImage;

	@Column(name = "url", nullable = true, length = 255)
	private String url;

	@Column(name = "emplacement", nullable = true, length = 255)
	private String emplacement;

	@ManyToOne
	@JoinColumn(name="CODE_POTFOLIO")
	private Portfolio potfolio;

	public long getIdImage() {
		return idImage;
	}

	public long getORMID() {
		return getIdImage();
	}

	public void setUrl(String value) {
		this.url = value;
	}

	public String getUrl() {
		return url;
	}

	public void setEmplacement(String value) {
		this.emplacement = value;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setPotfolio(Portfolio value) {
		this.potfolio = value;
	}

	public Portfolio getPotfolio() {
		return potfolio;
	}

	public String toString() {
		return String.valueOf(getIdImage());
	}

}