package com.example.persistance.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Conseiller implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long conseiller_id;
    private String nom;
    private String prenom;
    private String tel;
    private String adr_email;
    private String pwd;


    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @ManyToOne
    private Agence agence;

    @OneToMany(mappedBy="conseiller",fetch= FetchType.LAZY)
    private List<Imobiliere> imobilieres;

    public List<Imobiliere> getImobilieres() {
        return imobilieres;
    }

    public void setImobilieres(List<Imobiliere> imobilieres) {
        this.imobilieres = imobilieres;
    }

    public Conseiller() {super();
    }
    public Conseiller(long conseiller_id) {
        this.conseiller_id = conseiller_id;
    }

    public Conseiller(long conseiller_id, String nom, String prenom, String tel, String adr_email, String pwd, Agence agence, List<Imobiliere> imobilieres) {
        this.conseiller_id = conseiller_id;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adr_email = adr_email;
        this.pwd = pwd;
        this.agence = agence;
        this.imobilieres = imobilieres;
    }

    public long getConseiller_id() {
        return conseiller_id;
    }

    public void setConseiller_id(long conseiller_id) {
        this.conseiller_id = conseiller_id;
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

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
}
