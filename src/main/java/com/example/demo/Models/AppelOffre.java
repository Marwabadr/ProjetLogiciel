package com.example.demo.Models;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="appeloffre")
public class AppelOffre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AppeloffreID;

    private Date Date_debut;
    private Date Date_fin;
    @Column(name = "Etat")
    private String etat;


    @ManyToOne
    @JoinColumn(name = "FournisseurID")
    private Fournisseur fournisseur;

    // Getters and setters

    public int getAppeloffreID() {
        return AppeloffreID;
    }

    public void setAppeloffreID(int appeloffreID) {
        AppeloffreID = appeloffreID;
    }

    public Date getDate_debut() {
        return Date_debut;
    }

    public void setDate_debut(Date date_debut) {
        Date_debut = date_debut;
    }

    public Date getDate_fin() {
        return Date_fin;
    }

    public void setDate_fin(Date date_fin) {
        Date_fin = date_fin;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

}
