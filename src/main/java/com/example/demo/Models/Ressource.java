package com.example.demo.Models;

import javax.persistence.*;

@Entity
@Table(name = "ressource")
public class Ressource {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Marque")
	private String marque;

	@Column(name = "Numressource")
	private Integer numRessource;

	@Column(name = "RessourceID")
	private Integer ressourceId;

	@Column(name = "appeloffreid")
	private Integer appeloffreId;

	@Column(name = "DepartementID")
	private Integer departementId;  // Nullable

	@Column(name = "EnseignantID")
	private Integer enseignantId;   // Nullable

	@Column(name = "FournisseurID")
	private Integer fournisseurId;

	// Getter and Setter methods


	public Ressource() {
	}

	public int getFournisseurId() {
		return fournisseurId;
	}

	public void setFournisseurId(int fournisseurId) {
		this.fournisseurId = fournisseurId;
	}

	public Integer getDepartementId() {
		return departementId;
	}

	public void setDepartementId(Integer departementId) {
		this.departementId = departementId;
	}

	public Integer getEnseignantId() {
		return enseignantId;
	}

	public void setEnseignantId(Integer enseignantId) {
		this.enseignantId = enseignantId;
	}

	public int getAppeloffreId() {
		return appeloffreId;
	}

	public void setAppeloffreId(int appeloffreId) {
		this.appeloffreId = appeloffreId;
	}

	public int getRessourceId() {
		return ressourceId;
	}

	public void setRessourceId(int ressourceId) {
		this.ressourceId = ressourceId;
	}

	public int getNumRessource() {
		return numRessource;
	}

	public void setNumRessource(int numRessource) {
		this.numRessource = numRessource;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
