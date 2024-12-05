package com.example.persistance.entity;

import com.example.servCont.service.impliments.ProprietaireService;
import com.example.servCont.service.interfaces.IProprietaire;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Imobiliere implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long immobiliere_id;
    private String ref;
    private String localisation;
    private String statut;
    private String prix;

    private String type;
    private boolean negociable;
    @ManyToOne
    private Proprietaire proprietaire;
    @ManyToOne
    private Conseiller conseiller;

    @JsonIgnore
    @OneToMany(mappedBy="imobiliere",fetch= FetchType.LAZY)
    private List<Message> messageList;



    public Imobiliere(long immobiliere_id) {
        this.immobiliere_id = immobiliere_id;
    }

    public Imobiliere() {
        super();
    }

    public Imobiliere(long immobiliere_id, String ref, String localisation, String statut, String prix, String type, boolean negociable, Proprietaire proprietaire, Conseiller conseiller, List<Message> messageList) {
        this.immobiliere_id = immobiliere_id;
        this.ref = ref;
        this.localisation = localisation;
        this.statut = statut;
        this.prix = prix;
        this.type = type;
        this.negociable = negociable;
        this.proprietaire = proprietaire;
        this.conseiller = conseiller;
        this.messageList = messageList;
    }

    public Conseiller getConseiller() {
        return conseiller;
    }

    public void setConseiller(Conseiller conseiller) {
        this.conseiller = conseiller;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<Message> messageList) {
        this.messageList = messageList;
    }

    public long getId() {
        return immobiliere_id;
    }

    public void setId(long id) {
        this.immobiliere_id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public long getImmobiliere_id() {
        return immobiliere_id;
    }

    public void setImmobiliere_id(long immobiliere_id) {
        this.immobiliere_id = immobiliere_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNegociable() {
        return negociable;
    }

    public void setNegociable(boolean negociable) {
        this.negociable = negociable;
    }
    
}
