package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component
public class AffectationRequest {
    private int ressourceID;
    private int departementID;
    private int enseignantID;

    public int getRessourceID() {
        return ressourceID;
    }

    public void setRessourceID(int ressourceID) {
        this.ressourceID = ressourceID;
    }

    public int getDepartementID() {
        return departementID;
    }

    public void setDepartementID(int departementID) {
        this.departementID = departementID;
    }

    public int getEnseignantID() {
        return enseignantID;
    }

    public void setEnseignantID(int enseignantID) {
        this.enseignantID = enseignantID;
    }
}
