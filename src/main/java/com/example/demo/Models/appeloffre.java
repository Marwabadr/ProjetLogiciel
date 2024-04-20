package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;


/**
 * @author Lenovo
 * @version 1.0
 * @created 19-avr.-2024 14:25:17
 */
@Entity
public class appeloffre {

    private Date Date_debut;
    private Date Date_fin;
    @Id
    private Long AppeloffreID;

    public appeloffre(){

    }



    public void setId(Long id) {
        this.AppeloffreID = id;
    }

    public Long getId() {
        return AppeloffreID;
    }
}//end AppelOffre