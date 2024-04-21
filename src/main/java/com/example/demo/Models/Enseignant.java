package com.example.demo.Models;

import javax.persistence.*;


@Entity
public class Enseignant extends personne { // Assurez-vous que la classe Enseignant hérite correctement de la classe personne

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EnseignantID") // Spécifie le nom de la colonne de l'ID
	private Integer enseignantID; // Modifie le type de données pour correspondre à la colonne EnseignantID

	@Column(name = "DepartementID") // Spécifie le nom de la colonne du département ID
	private Integer departementID;

	@Column(name = "nomEnseignant") // Spécifie le nom de la colonne du nom de l'enseignant
	private String nomEnseignant; // Ajoute la nouvelle colonne nomEnseignant

	// Constructeur par défaut
	public Enseignant() {
		super(); // Appel du constructeur de la classe parente personne
	}

	// Getters et setters
	public Integer getEnseignantID() {
		return enseignantID;
	}

	public void setEnseignantID(Integer enseignantID) {
		this.enseignantID = enseignantID;
	}

	public Integer getDepartementID() {
		return departementID;
	}


	public void setDepartementID(Integer departementID) {
		this.departementID = departementID;
	}

	public String getNomEnseignant() {
		return nomEnseignant;
	}

	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}}
