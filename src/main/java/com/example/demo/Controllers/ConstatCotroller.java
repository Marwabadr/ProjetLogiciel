package com.example.demo.Controllers;

import com.example.demo.Models.Constat;
import com.example.demo.Services.AjouterConstat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ConstatCotroller {
    @Autowired
    private AjouterConstat ajouterConstat;

    @PostMapping("/constat")
    public String submitForm(@ModelAttribute("constat") Constat constat) {
        ajouterConstat.saveConstat(constat);
        return "redirect:/constat.html";
    }

    @GetMapping("/constat.html")
    public String constat(Model model) {
        model.addAttribute("constat", new Constat());
        return "constat"; // Le nom de votre fichier constat.html sans l'extension
    }
}
