package com.example.persistance.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Proprietaire implements Serializable {
    public Proprietaire() {
        super();
    }

    public Proprietaire(long id) {
        this.proprietaire_id = id;
    }

    public Proprietaire(long proprietaire_id, String prenom, String nom, String tel, String adr_email, String pwd, List<Imobiliere> imobilieres) {
        this.proprietaire_id = proprietaire_id;
        this.prenom = prenom;
        this.nom = nom;
        this.tel = tel;
        this.adr_email = adr_email;
        this.pwd = pwd;
        this.imobilieres = imobilieres;
    }

    public long getId() {
        return proprietaire_id;
    }

    public void setId(long id) {
        this.proprietaire_id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdr_email() {
        return adr_email;
    }

    public void setAdr_email(String adr_email) {
        this.adr_email = adr_email;
    }

    public long getProprietaire_id() {
        return proprietaire_id;
    }

    public void setProprietaire_id(long proprietaire_id) {
        this.proprietaire_id = proprietaire_id;
    }

    public List<Imobiliere> getImobilieres() {
        return imobilieres;
    }

    public void setImobilieres(List<Imobiliere> imobilieres) {
        this.imobilieres = imobilieres;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long proprietaire_id;
    private String prenom;
    private String nom;
    private String tel;
    private String adr_email;
    private String pwd;

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @JsonIgnore
    @OneToMany(mappedBy="proprietaire",fetch= FetchType.LAZY)
    private List<Imobiliere> imobilieres;
}
