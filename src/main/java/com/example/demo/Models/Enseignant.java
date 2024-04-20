package com.example.demo.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Enseignant extends personne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	public Enseignant() {

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
}

