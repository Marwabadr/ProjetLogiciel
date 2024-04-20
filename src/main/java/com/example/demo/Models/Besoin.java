package com.example.demo.Models;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Besoin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String description;
	private String nom;
	private Integer besoinID;
	private Integer enseignantID;
	private Integer quantite; // Nouvel attribut

	public Besoin() {
		// Constructeur par défaut
	}

	// Getters et setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getBesoinID() {
		return besoinID;
	}

	public void setBesoinID(Integer besoinID) {
		this.besoinID = besoinID;
	}

	public Integer getEnseignantID() {
		return enseignantID;
	}

	public void setEnseignantID(Integer enseignantID) {
		this.enseignantID = enseignantID;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
}


