package com.example.demo.Models;


import javax.persistence.*;

/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:24:59
 */
@Entity
@Table(name = "ordinateur")
public class ordinateur extends Ressource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CPU;
	private int Disquedur;
	private int ecran;
	private int RAM;

	public ordinateur(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end ordinateur