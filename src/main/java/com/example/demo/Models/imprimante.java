package com.example.demo.Models;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:01
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class imprimante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private String vitesseImpression;
	private String resolution;

	// Constructeurs, getters et setters

	public Long getId() {
		return id;
	}

	public String getMarque() {
		return marque;
	}

	public String getVitesseImpression() {
		return vitesseImpression;
	}

	public String getResolution() {
		return resolution;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public void setVitesseImpression(String vitesseImpression) {
		this.vitesseImpression = vitesseImpression;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
