package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:20
 */


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Besoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String nom;



	public Besoin(){

	}



	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}//end Besoin