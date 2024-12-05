package com.example.persistance.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity

public class Message implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long message_id;
    private String Nom;
    private String prenom;
    private String email;
    private String tel;
    private String message;
    @ManyToOne
    private Imobiliere imobiliere;

    public Message(long message_id, String nom, String prenom, String email, String tel, String message, Imobiliere imobiliere) {
        this.message_id = message_id;
        Nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.message = message;
        this.imobiliere = imobiliere;
    }

    public Message() {
        super();
    }

    public long getMessage_id() {
        return message_id;
    }

    public void setMessage_id(long message_id) {
        this.message_id = message_id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Imobiliere getImobiliere() {
        return imobiliere;
    }

    public void setImobiliere(Imobiliere imobiliere) {
        this.imobiliere = imobiliere;
    }
}
