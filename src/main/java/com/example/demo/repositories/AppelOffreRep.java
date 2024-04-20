package com.example.demo.repositories;

import com.example.demo.Models.appeloffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AppelOffreRep extends JpaRepository<appeloffre,Integer> {

    @Query("select o from appeloffre o")
    public List<appeloffre> getAllAppelOffres();

}
