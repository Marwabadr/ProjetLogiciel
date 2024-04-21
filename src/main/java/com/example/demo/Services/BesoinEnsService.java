package com.example.demo.Services;

import com.example.demo.Models.Besoin;
import com.example.demo.repositories.BesoinEnsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BesoinEnsService {



    private  BesoinEnsRepository besoinRepository;

    public void ajouterBesoin(Besoin besoin) {
        // Logique métier pour ajouter un besoin
        besoinRepository.save(besoin);
    }


}
