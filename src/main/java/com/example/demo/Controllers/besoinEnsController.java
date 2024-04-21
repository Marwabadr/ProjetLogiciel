package com.example.demo.Controllers;

import com.example.demo.Models.Besoin;
import com.example.demo.Models.ordinateur;
import com.example.demo.Models.imprimante;
import com.example.demo.Services.BesoinEnsService;
import com.example.demo.Services.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class besoinEnsController {
    @Autowired
    private  BesoinEnsService besoinService;


    @PostMapping("/enseignant1")
    public String ajouterBesoin(HttpServletRequest request) {
        String description = request.getParameter("besoin");
        String nom = request.getParameter("nom");
        String typeRessource = request.getParameter("typeRessource");
        Long ordinateurId = null;
        Long imprimanteId = null;

        if ("ordinateur".equals(typeRessource)) {
            // Insérer dans la table Ordinateur
            ordinateur ordinateur = new ordinateur();
            ordinateur.setMarque(request.getParameter("marque"));
            ordinateur.setRam(request.getParameter("ram"));
            ordinateur.setCpu(request.getParameter("cpu"));
            ordinateur.setDisqueDur(request.getParameter("disque"));
            ordinateur.setEcran(request.getParameter("ecran"));
            // Insérer dans la base de données
            ordinateurId = EquipementService.ajouterOrdinateur(ordinateur);
        } else if ("imprimante".equals(typeRessource)) {
            // Insérer dans la table Imprimante
            imprimante imprimante = new imprimante();
            imprimante.setMarque(request.getParameter("marque"));
            imprimante.setVitesseImpression(request.getParameter("vitesseImpression"));
            // Insérer dans la base de données
            imprimanteId = EquipementService.ajouterImprimante(imprimante);
        }

        // Insérer dans la table Besoin
        Besoin besoin = new Besoin();
        besoin.setDescription(description);
        besoin.setNom(nom);
        besoin.setOrdinateurId(ordinateurId);
        besoin.setImprimanteId(imprimanteId);

        // Enregistrer le besoin
        besoinService.ajouterBesoin(besoin);

        return "redirect:/enseignant1"; // Rediriger vers une page de succès ou une autre page appropriée
    }


    @GetMapping("/enseignant1")
    public String afficherFormulaire(Model model) {
        model.addAttribute("enseignant1", new Besoin());
        return "enseignant1"; // Le nom de votre fichier enseignant1.html sans l'extension
    }


}