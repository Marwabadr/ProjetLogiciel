package com.example.demo.repositories;

import com.example.demo.Models.Besoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BesoinEnsRepository extends JpaRepository<Besoin, Long> {
    // Méthodes de recherche supplémentaires si nécessaire
}
