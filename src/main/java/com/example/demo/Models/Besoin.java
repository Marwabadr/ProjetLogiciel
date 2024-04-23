package com.example.demo.Models;

import javax.persistence.*;


@Entity
@Table(name = "besoin")
public class Besoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int BesoinID;

	private String Nom;
	private Integer ImprimanteID;
	private Integer OrdinateurID;
	private Integer  EnseignantID;
	private String Marque;
	@Column(name = "Etat")
	private String etat;

	private String description;

	public int getBesoinID() {
		return BesoinID;
	}

	public void setBesoinID(int besoinID) {
		BesoinID = besoinID;
	}

	public Besoin() {
	}

	public String getMarque() {
		return Marque;
	}

	public void setMarque(String marque) {
		Marque = marque;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getEnseignantID() {
		return EnseignantID;
	}

	public void setEnseignantID(int enseignantID) {
		EnseignantID = enseignantID;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		etat = etat;
	}

	public int getOrdinateurID() {
		return OrdinateurID;
	}

	public void setOrdinateurID(int ordinateurID) {
		OrdinateurID = ordinateurID;
	}

	public int getImprimanteID() {
		return ImprimanteID;
	}

	public void setImprimanteID(int imprimanteID) {
		ImprimanteID = imprimanteID;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}


	// Getters and setters
}

