//package com.example.demo.Controllers;
//
//import com.example.demo.DataTransferObjects.BesoinEnseignantDTO;
//import com.example.demo.Services.BesoinService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import java.util.List;
//
//@Controller
//public class ConsulterBesoinController {
//
//    @Autowired
//    private BesoinService besoinService;
//
//    @GetMapping("/consulter-besoins")
//    public String consulterBesoin(Model model) {
//        List<BesoinEnseignantDTO> besoins = besoinService.getBesoinEnseignantData();
//        model.addAttribute("besoins", besoins);
//        return "ConsulerbesoinChef"; // Assurez-vous d'avoir une page HTML correspondante nommée "consulter-besoins.html"
//    }
//}
