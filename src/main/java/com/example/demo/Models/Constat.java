package com.example.demo.Models;
import javax.persistence.*;
import java.sql.Date;

/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:03
 */
@Entity
@Table(name = "Constat")
public class Constat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "dateapparition")
	private Date dateapparition;
	@Column(name = "explicationpanne")
	private String explicationpanne;
	@Column(name = "frequence")
	private int frequence;
	@Column(name = "ordre")
	private String ordre;


	public Constat(){

	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Date getDateapparition() {
		return dateapparition;
	}

	public int getFrequence() {
		return frequence;
	}

	public String getOrdre() {
		return ordre;
	}

	public String getExplicationpanne() {
		return explicationpanne;
	}

	public void setDateapparition(Date dateapparition) {
		this.dateapparition = dateapparition;
	}

	public void setExplicationpanne(String explicationpanne) {
		this.explicationpanne = explicationpanne;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public void setOrdre(String ordre) {
		this.ordre = ordre;
	}
}//end Constat