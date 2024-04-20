package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Enseignant extends personne {

	@Id
	private Long id;

	@OneToMany(mappedBy = "enseignant")
	private List<Besoin> besoins;

	public Enseignant(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public List<Besoin> getBesoins() {
		return besoins;
	}

	public void setBesoins(List<Besoin> besoins) {
		this.besoins = besoins;
	}
}
