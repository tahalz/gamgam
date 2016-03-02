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
@Table(name="ThemeCarte")
public class ThemeCarte implements Serializable {


	public ThemeCarte() {
	}
	
	@Column(name="TypeCVidType", nullable=false, length=19)	
	private long typeCVidType;
	
	@ManyToOne	
	@JoinColumn(name="CODE_CATEVISITE")	
	private CarteVisite carteVisite;
	
	@Column(name="idThemeCarte", nullable=false, unique=true, length=20)	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long idThemeCarte;
	
	public void setTypeCVidType(long value) {
		this.typeCVidType = value;
	}
	
	public long getTypeCVidType() {
		return typeCVidType;
	}
	
	public long getIdThemeCarte() {
		return idThemeCarte;
	}
	
	public long getORMID() {
		return getIdThemeCarte();
	}
	
	public void setCarteVisite(CarteVisite value) {
		this.carteVisite = value;
	}
	
	public CarteVisite getCarteVisite() {
		return carteVisite;
	}
	
	public String toString() {
		return String.valueOf(getIdThemeCarte());
	}
	
}
