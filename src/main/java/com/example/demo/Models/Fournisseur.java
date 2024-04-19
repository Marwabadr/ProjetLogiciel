package com.example.demo.Models;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:09
 */
public class Fournisseur extends personne {

	public Ressource m_Ressource;
	public Societe m_Societe;

	public Fournisseur(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Fournisseur