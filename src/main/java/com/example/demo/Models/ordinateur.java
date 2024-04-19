package com.example.demo.Models;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:24:59
 */
public class ordinateur extends Ressource {

	private int CPU;
	private int Disque dur;
	private int ecran;
	private int RAM;

	public ordinateur(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end ordinateur