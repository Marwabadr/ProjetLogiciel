//package com.example.demo.Services;
//
//import com.example.demo.Models.Besoin;
//import com.example.demo.repositories.BesoinRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class BesoinEnsService {
//
//    private  BesoinRepository besoinRepository;
//
//    @Autowired // Ajoutez cette annotation pour l'injection de dépendance
//    public BesoinEnsService(BesoinRepository besoinRepository) {
//        this.besoinRepository = besoinRepository;
//    }
//
//    public void ajouterBesoin(Besoin besoin) {
//        // Logique métier pour ajouter un besoin
//        besoinRepository.save(besoin);
//    }
//}
