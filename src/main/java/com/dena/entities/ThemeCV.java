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
@Table(name = "ThemeCV")
public class ThemeCV implements Serializable {
	

	public ThemeCV() {
	}

	@ManyToOne
	@JoinColumn(name="CODE_TYPECV")
	private TypeCV typeCV;

	@Column(name = "idTheme", nullable = false, unique = true, length = 20)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTheme;

	@Column(name = "nomTheme", nullable = true, length = 255)
	private String nomTheme;

	public long getIdTheme() {
		return idTheme;
	}

	public long getORMID() {
		return getIdTheme();
	}

	public void setNomTheme(String value) {
		this.nomTheme = value;
	}

	public String getNomTheme() {
		return nomTheme;
	}

	public void setTypeCV(TypeCV value) {
		this.typeCV = value;
	}

	public TypeCV getTypeCV() {
		return typeCV;
	}

	public String toString() {
		return String.valueOf(getIdTheme());
	}

}
