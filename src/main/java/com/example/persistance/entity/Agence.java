package com.example.persistance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Agence implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agence_id;
    private String nom;
    private String tel;
    private String adresse;
    private String ville;
    private String adr_email;
    @JsonIgnore
    @OneToMany(mappedBy="agence",fetch= FetchType.LAZY)
    private List<Conseiller> conseiller;


    public Agence() {
        super();
    }
    public Agence(long id) {
        this.agence_id = id;
    }

    public Agence(long agence_id, String nom, String tel, String adresse, String ville, String adr_email, List<Conseiller> conseiller) {
        this.agence_id = agence_id;
        this.nom = nom;
        this.tel = tel;
        this.adresse = adresse;
        this.ville = ville;
        this.adr_email = adr_email;
        this.conseiller = conseiller;
    }

    public long getAgence_id() {
        return agence_id;
    }

    public void setAgence_id(long agence_id) {
        this.agence_id = agence_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getAdr_email() {
        return adr_email;
    }

    public void setAdr_email(String adr_email) {
        this.adr_email = adr_email;
    }

    public List<Conseiller> getConseiller() {
        return conseiller;
    }

    public void setConseiller(List<Conseiller> conseiller) {
        this.conseiller = conseiller;
    }
}
