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
public class ordinateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private Integer ram;
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


	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
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