package com.example.demo.Services;

import com.example.demo.Models.Besoin;
import com.example.demo.repositories.BesoinEnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BesoinEnsService {

    private BesoinEnsRepository besoinRepository;

    @Autowired // Ajoutez cette annotation pour l'injection de dépendance
    public BesoinEnsService(BesoinEnsRepository besoinRepository) {
        this.besoinRepository = besoinRepository;
    }

    public void ajouterBesoin(Besoin besoin) {
        // Logique métier pour ajouter un besoin
        besoinRepository.save(besoin);
    }
}
