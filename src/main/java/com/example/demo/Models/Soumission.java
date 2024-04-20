package com.example.demo.Models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Soumission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date_livraison;
    private Integer duree_garantie;
    private String description;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate_livraison() {
        return date_livraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.date_livraison = dateLivraison;
    }

    public Integer getDureeGarantie() {
        return duree_garantie;
    }

    public void setDureeGarantie(Integer dureeGarantie) {
        this.duree_garantie = dureeGarantie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
