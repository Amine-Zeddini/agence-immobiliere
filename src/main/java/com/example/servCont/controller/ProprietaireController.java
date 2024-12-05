package com.example.servCont.controller;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;
import com.example.servCont.service.interfaces.IProprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ProprietaireController {
    @Autowired
    IProprietaire ProprietaireService;

    @PostMapping("/save")
    Proprietaire save(@RequestBody Proprietaire proprietaire) {
        System.out.println("*******save ***********");
        Proprietaire p=ProprietaireService.SaveProprietaire(proprietaire);
        System.out.println("*******"+p.getNom());
        return p ;
    }
    @GetMapping("/{id}")
    Proprietaire getProprietaire(@PathVariable Long id) {
        return ProprietaireService.getProprietaire(id);
    }
    @GetMapping("/all")
    List<Proprietaire> getListProprietaire() {
        return ProprietaireService.getListProprietaire();
    }
    @PostMapping("/update")
    public Proprietaire updateProprietaire(@RequestBody Proprietaire proprietaire) {
        return ProprietaireService.updateProprietaire(proprietaire);
    }

    @GetMapping("/delete/{id}")
    public boolean deleteProprietaire(@PathVariable Long id) {
        ProprietaireService.deleteProprietaire(id);
        return true;
    }




}
