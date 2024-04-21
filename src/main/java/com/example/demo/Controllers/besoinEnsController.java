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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

@Controller
public class besoinEnsController {
    @Autowired
    private  BesoinEnsService besoinService;
    private static final Logger logger = LoggerFactory.getLogger(besoinEnsController.class);


    @PostMapping("/enseignant1")
    public String ajouterBesoin(HttpServletRequest request) {
        String nom = request.getParameter("nom");
        String typeRessource = request.getParameter("typeRessource");
        Long ordinateurId = null;
        Long imprimanteId = null;

        // Affichage des valeurs dans la console

        logger.info("Nom: {}", nom);
        logger.info("Type de ressource: {}", typeRessource);

        if ("ordinateur".equals(typeRessource)) {
            // Insérer dans la table Ordinateur
            logger.info("Marque de l'ordinateur: {}", request.getParameter("marque"));
            ordinateur ordinateur = new ordinateur();
            ordinateur.setMarque(request.getParameter("marque"));
            ordinateur.setRam(Integer.parseInt(request.getParameter("ram")));
            ordinateur.setCpu(request.getParameter("cpu"));
            ordinateur.setDisqueDur(request.getParameter("disque_dur"));
            ordinateur.setEcran(request.getParameter("ecran"));
            // Insérer dans la base de données
            ordinateurId = EquipementService.ajouterOrdinateur(ordinateur);
        } else if ("imprimante".equals(typeRessource)) {
            logger.info("Marque de l'imprimante: {}", request.getParameter("marque"));
            // Insérer dans la table Imprimante
            imprimante imprimante = new imprimante();
            imprimante.setMarque(request.getParameter("marque"));
            imprimante.setVitesseImpression(request.getParameter("vitesseImpression"));
            // Insérer dans la base de données
            imprimanteId = EquipementService.ajouterImprimante(imprimante);
        }

        // Insérer dans la table Besoin
        Besoin besoin = new Besoin();
        besoin.setNom(nom);
        besoin.setQuantite(Integer.parseInt(request.getParameter("quantite"))); // Conversion en entier
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