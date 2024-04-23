//package com.example.demo.Controllers;
//
//import com.example.demo.Models.Soumission;
//import com.example.demo.Services.SoumissionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//@Controller
//public class SoumissionController {
//    @Autowired
//    private SoumissionService soumissionService;
//
//    @PostMapping("/soumission")
//    public String submitForm(@ModelAttribute("soumission") Soumission soumission) {
//        soumissionService.saveSoumission(soumission);
//        return "redirect:/soumission.html";
//    }
//
//    @GetMapping("/soumission.html")
//    public String soumission(Model model) {
//        model.addAttribute("soumission", new Soumission());
//        return "soumission"; // Le nom de votre fichier soumission.html sans l'extension
//    }
//}
