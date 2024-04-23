package com.example.demo.Models;

import javax.persistence.*;


import java.sql.Date;

/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:03
 */
@Entity
public class Constat {

	private Date dateapparition;
	private String explicationpanne;
	private int frequence;
	private String ordre;
	@Id
	private Long id;

	public Constat(){

	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}//end Constat