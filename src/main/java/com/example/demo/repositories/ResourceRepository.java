package com.example.demo.repositories;

import com.example.demo.Models.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public interface ResourceRepository extends JpaRepository<Ressource, Long> {
    // Your repository methods
}
