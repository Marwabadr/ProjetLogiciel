package com.example.demo.Controllers;

import com.example.demo.Models.ordinateur;
import com.example.demo.Models.imprimante;
import com.example.demo.Models.Ressource;
import com.example.demo.Services.EquipementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RessourceController {

    private EquipementService equipementService;

    @Autowired
    public RessourceController(EquipementService equipementService) {
        this.equipementService = equipementService;
    }

    @PostMapping("/ajouterRessource")
    @ResponseBody
    public String ajouterRessource(@RequestBody RessourceForm form) {

        if (form.getTypeRessource().equals("ordinateur")) {
            ordinateur ord  = new ordinateur();
            ord.setMarque(form.getMarque());
            ord.setRam(form.getRam());
            ord.setCpu(form.getCpu());
            ord.setDisqueDur(form.getDisque());
            ord.setEcran(form.getEcran());
        } else if (form.getTypeRessource().equals("imprimante")) {
            imprimante impr = new imprimante();
            impr.setMarque(form.getMarque());
            impr.setVitesseImpression(form.getVitesseImpression());
            impr.setResolution(form.getResolution());
        } else {
            return "Type de ressource non pris en charge";
        }

        /*Long id = equipementService.ajouterRessource(ressource);*/
        return "Ressource ajoutée avec succès, ID: " + id;
    }
}

