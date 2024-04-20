package com.example.demo.Controllers;

import com.example.demo.Models.Soumission;
import com.example.demo.Services.SoumissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SoumissionController {
    @Autowired
    private SoumissionService soumissionService;

    @PostMapping("/soumission")
    public String submitForm(@ModelAttribute("soumission") Soumission soumission) {
        soumissionService.saveSoumission(soumission);
        return "redirect:/soumission";
    }

}
