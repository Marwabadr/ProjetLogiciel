

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

	private Date dateDebut;
	private Date dateFin;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  AppeloffreID;


	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public int getAppelOffreId() {
		return  AppeloffreID;
	}

	public void setAppelOffreId(int appelOffreId) {
		this. AppeloffreID = appelOffreId;
	}
}
