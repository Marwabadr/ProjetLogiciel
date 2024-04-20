package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "appeloffre")
public class AppelOffre {

    private Date Date_debut;
    private Date Date_fin;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  AppeloffreID;

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

    public int getAppeloffreID() {
        return AppeloffreID;
    }

    public void setAppeloffreID(int appeloffreID) {
        AppeloffreID = appeloffreID;
    }

    public int getAppelOffreId() {
        return  AppeloffreID;
    }

    public void setAppelOffreId(int appelOffreId) {
        this. AppeloffreID = appelOffreId;
    }
}