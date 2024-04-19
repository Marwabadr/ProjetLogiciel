package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:20
 */
public class Besoin {

	private String description;
	private String nom;
	public Enseignant m_Enseignant;
	@Id
	private Long id;

	public Besoin(){

	}



	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}//end Besoin