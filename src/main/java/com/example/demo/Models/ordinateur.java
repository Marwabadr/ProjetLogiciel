package com.example.demo.Models;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:24:59
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ordinateur extends Ressource{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private String ram;
	private String cpu;
	private String disqueDur;
	private String ecran;

	// Constructeurs, getters et setters

	public String getEcran() {
		return ecran;
	}

	public void setEcran(String ecran) {
		this.ecran = ecran;
	}

	@Override
	public String getMarque() {
		return marque;
	}

	@Override
	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getDisqueDur() {
		return disqueDur;
	}

	public void setDisqueDur(String disqueDur) {
		this.disqueDur = disqueDur;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
}