package com.example.demo.DataTransferObjects;

public class BesoinDto {

    private String description;
    private String nom;
    private Long enseignantId;

    // Constructeurs
    public BesoinDto() {}

    public BesoinDto(String description, String nom, Long enseignantId) {
        this.description = description;
        this.nom = nom;
        this.enseignantId = enseignantId;
    }

    // Getters et Setters
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

    public Long getEnseignantId() {
        return enseignantId;
    }

    public void setEnseignantId(Long enseignantId) {
        this.enseignantId = enseignantId;
    }
}

