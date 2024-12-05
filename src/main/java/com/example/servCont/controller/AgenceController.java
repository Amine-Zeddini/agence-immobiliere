package com.example.servCont.controller;

import com.example.persistance.entity.Agence;
import com.example.persistance.entity.Proprietaire;
import com.example.servCont.service.interfaces.IAgence;
import com.example.servCont.service.interfaces.IProprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class AgenceController {
    @Autowired
    IAgence AgenceService;

    @PostMapping("/saveAgence")
    Agence save(@RequestBody Agence agence) {
        System.out.println("*******save ***********");
        Agence a=AgenceService.SaveAgence(agence);
        System.out.println("*******"+a.getNom());
        return a ;
    }
    @PostMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return AgenceService.updateAgence(agence);
    }
}
