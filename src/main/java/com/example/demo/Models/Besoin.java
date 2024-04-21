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


	private String nom;
	private Integer besoinID;
	private Integer enseignantID;
	private Integer quantite; // Nouvel attribut

	private Integer OrdinateurID; // Champ pour stocker l'ID de l'ordinateur
	private Integer ImprimanteID; // Champ pour stocker l'ID de l'imprimante

	public Besoin() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}




	// Getters et setters


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public Integer getOrdinateurId() {
		return OrdinateurID;
	}

	public void setOrdinateurId(Long OrdinateurID) {
		this.OrdinateurID = Math.toIntExact(OrdinateurID);
	}

	public Integer getImprimanteId() {
		return ImprimanteID;
	}

	public void setImprimanteId(Long ImprimanteID) {
		this.ImprimanteID = Math.toIntExact(ImprimanteID);
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