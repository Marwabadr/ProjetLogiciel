package com.example.demo.Controllers;

import antlr.ASTNULLType;
import com.example.demo.Models.Ressource;
import com.example.demo.Services.affecterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AffecterController {

    private final affecterService affecterService;

    @Autowired
    public AffecterController(affecterService affecterService) {
        this.affecterService = affecterService;
    }

    @GetMapping("/affecter")
    public String showAffecterPage(Model model) {
        List<Ressource> ressources = affecterService.getAllRessources();
        model.addAttribute("ressources", ressources);
        model.addAttribute("selectedRessource", new Ressource()); // Add this line
        return "affecter";
    }

}

