package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Departement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DepartementID;

	private String Nom; // Ajout du champ 'Nom'

	private Integer Budget;

	// Getters and setters
	public Long getDepartementID() {
		return DepartementID;
	}

	public void setDepartementID(Long departementID) {
		DepartementID = departementID;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Integer getBudget() {
		return Budget;
	}

	public void setBudget(Integer budget) {
		Budget = budget;
	}
}
