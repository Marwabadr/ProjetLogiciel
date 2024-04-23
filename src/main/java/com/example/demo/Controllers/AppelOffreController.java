//package com.example.demo.Controllers;
//
//import com.example.demo.Models.AppelOffre;
//import com.example.demo.Services.appeloffrServie;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//@Controller
//public class AppelOffreController {
//    @Autowired
//    private appeloffrServie service;
//
//    @GetMapping("/fournisseur/{id}")
//    public String getAppelOffre(Model model) {
//        AppelOffre appelOffre = service.get(1);
//        model.addAttribute("appelOffre", appelOffre);
//
//        // Ajout d'un message de journalisation pour vérifier l'objet AppelOffre
//        System.out.println("AppelOffre récupéré : " + appelOffre);
//
//        return "fournisseur";
//    }
//}
