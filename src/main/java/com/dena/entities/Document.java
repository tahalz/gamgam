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
@Table(name = "Document")
public class Document implements Serializable {
	

	public Document() {
	}

	@Column(name = "idDocument", nullable = false, unique = true, length = 19)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idDocument;

	@Column(name = "emplacement", nullable = true, length = 255)
	private String emplacement;

	@ManyToOne
	@JoinColumn(name="CODE_PORTFOLIO")
	private Portfolio portfolio;

	public long getIdDocument() {
		return idDocument;
	}

	public long getORMID() {
		return getIdDocument();
	}

	public void setEmplacement(String value) {
		this.emplacement = value;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setPortfolio(Portfolio value) {
		this.portfolio = value;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public String toString() {
		return String.valueOf(getIdDocument());
	}

}
