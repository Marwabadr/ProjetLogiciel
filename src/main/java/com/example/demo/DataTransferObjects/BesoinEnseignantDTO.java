package com.example.demo.DataTransferObjects;

public class BesoinEnseignantDTO {
    private Integer besoinID;
    private String description;
    private String nomBesoin;
    private String nomEnseignant;
    private Integer quantite;

    // Constructeur par défaut
    public BesoinEnseignantDTO() {}

    // Getters et setters
    public Integer getBesoinID() {
        return besoinID;
    }

    public void setBesoinID(Integer besoinID) {
        this.besoinID = besoinID;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomBesoin() {
        return nomBesoin;
    }

    public void setNomBesoin(String nomBesoin) {
        this.nomBesoin = nomBesoin;
    }

    public String getNomEnseignant() {
        return nomEnseignant;
    }

    public void setNomEnseignant(String nomEnseignant) {
        this.nomEnseignant = nomEnseignant;
    }
}

