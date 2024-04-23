package com.example.demo.Models;


import javax.persistence.*;

/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:15
 */
@Entity
public class compte {

	private String login;
	private String motPass;
	@Id
	private Long id;

	public compte(){

	}


	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}//end compte