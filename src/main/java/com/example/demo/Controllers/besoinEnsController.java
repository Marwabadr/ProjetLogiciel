package com.example.demo.Controllers;

import com.example.demo.Models.Besoin;
import com.example.demo.Services.BesoinEnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class besoinEnsController {
    @Autowired
    private  BesoinEnsService besoinService;


    @PostMapping("/ajouter")
    public String ajouterBesoin(@ModelAttribute("ajouter") Besoin besoin) {
        besoinService.ajouterBesoin(besoin);
        return "redirect:/ajouter"; // Rediriger vers une page de succès ou une autre page appropriée
    }
}