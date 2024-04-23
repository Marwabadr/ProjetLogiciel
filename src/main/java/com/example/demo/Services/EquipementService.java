//package com.example.demo.Services;
//
//import com.example.demo.Models.ordinateur;
//import com.example.demo.Models.imprimante;
//import com.example.demo.repositories.OrdinateurRepository;
//import com.example.demo.repositories.ImprimanteRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EquipementService {
//    private static OrdinateurRepository ordinateurRepository;
//    private static ImprimanteRepository imprimanteRepository;
//
//
//    @Autowired
//    public EquipementService(OrdinateurRepository ordinateurRepository, ImprimanteRepository imprimanteRepository) {
//        this.ordinateurRepository = ordinateurRepository;
//        this.imprimanteRepository = imprimanteRepository;
//    }
//
//    public static Long ajouterOrdinateur(ordinateur ordinateur) {
//        return ordinateurRepository.save(ordinateur).getId();
//    }
//
//    public static Long ajouterImprimante(imprimante imprimante) {
//        return imprimanteRepository.save(imprimante).getId();
//    }
//}
//
