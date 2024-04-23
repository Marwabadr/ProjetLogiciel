package com.example.demo.Services;

import com.example.demo.Models.Constat;
import com.example.demo.repositories.AppelOffreRep;
import com.example.demo.repositories.ConstatRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AjouterConstat {
    private ConstatRep constatRepo;
    @Autowired


    public AjouterConstat(ConstatRep constatRep) {
        this.constatRepo = constatRep;
    }
    public void saveConstat(Constat constat) {
        constatRepo.save(constat);
    }

}
