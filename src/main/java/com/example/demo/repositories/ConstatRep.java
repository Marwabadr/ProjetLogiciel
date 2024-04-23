package com.example.demo.repositories;

import com.example.demo.Models.Constat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstatRep extends JpaRepository<Constat,Long> {

}
