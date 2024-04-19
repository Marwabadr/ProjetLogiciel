package com.example.demo.Models;


import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:17
 */
public class AppelOffre {

	private Date date_debut;
	private Date date_fin;
	@Id
	private Long id;

	public AppelOffre(){

	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}//end AppelOffre