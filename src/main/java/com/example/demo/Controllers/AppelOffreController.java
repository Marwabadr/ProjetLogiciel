package com.example.demo.Controllers;

import com.example.demo.Models.appeloffre;
import com.example.demo.repositories.AppelOffreRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppelOffreController {
    @Autowired
    private AppelOffreRep appelOffreRep;

    @GetMapping("/appeloffre")
    public String getAppelOffre(Model model) {
        appeloffre appelOffre = appelOffreRep.findById(1).orElse(null); // Suppose que l'appel d'offre a l'ID 1
        model.addAttribute("appelOffre", appelOffre);
        return "fournisseur";
    }
}
