package com.example.demo.Services;

import com.example.demo.Models.AppelOffre;
import com.example.demo.repositories.AppelOffreRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class appeloffrServie {
    private final AppelOffreRep rep;

    @Autowired
    public appeloffrServie(AppelOffreRep rep) {
        this.rep = rep;
    }

    public AppelOffre get(int id) {
        return rep.findById(id).orElse(null);
    }
}
