package com.example.demo.Controllers;

import com.example.demo.Models.Besoin;
import com.example.demo.Services.BesoinEnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class besoinEnsController {
    @Autowired
    private  BesoinEnsService besoinService;

    @PostMapping("/enseignant1")
    public String ajouterBesoin(@ModelAttribute("enseignant1") Besoin besoin) {
        besoinService.ajouterBesoin(besoin);
        return "redirect:/enseignant1"; // Rediriger vers une page de succès ou une autre page appropriée
    }
    @GetMapping("/enseignant1")
    public String afficherFormulaire(Model model) {
        model.addAttribute("enseignant1", new Besoin());
        return "enseignant1"; // Le nom de votre fichier enseignant1.html sans l'extension
    }


}