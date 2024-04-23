package com.example.demo.Models;

import javax.persistence.*;

@Entity
public class Fournisseur {
	@Id
	private int FournisseurID;

	public Fournisseur() {
		// Constructeur par défaut nécessaire pour Hibernate
	}

	public void setId(int id) {
		this.FournisseurID = id;
	}

	public int getId() {
		return FournisseurID;
	}
}
