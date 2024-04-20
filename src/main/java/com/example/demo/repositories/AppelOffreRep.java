package com.example.demo.Repositories;

import com.example.demo.Models.AppelOffre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AppelOffreRep extends JpaRepository<AppelOffre,Integer> {


}
