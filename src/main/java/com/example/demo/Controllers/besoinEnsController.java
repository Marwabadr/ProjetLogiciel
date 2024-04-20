package com.example.demo.Controllers;
import com.example.demo.DataTransferObjects.BesoinDto;
import com.example.demo.Services.BesoinEnsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.DataTransferObjects.BesoinDto;

@RestController
@RequestMapping("/besoins")
public class besoinEnsController {

    private final BesoinEnsService besoinService;

    @Autowired
    public besoinEnsController(BesoinEnsService besoinService) {
        this.besoinService = besoinService;
    }

    @PostMapping("/ajouter")
    public String ajouterBesoin(@RequestBody BesoinDto besoinDto) {
        besoinService.ajouterBesoin(besoinDto);
        return "redirect:/success"; // Rediriger vers une page de succès ou une autre page appropriée
    }
}

