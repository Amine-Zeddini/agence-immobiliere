package com.example.servCont.controller;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;
import com.example.servCont.service.interfaces.IImobiliere;
import com.example.servCont.service.interfaces.IProprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ImobiliereController {
    @Autowired
    IImobiliere ImobiliereService;
    @PostMapping("/Imobiliere/save")
    Imobiliere save(@RequestBody Imobiliere imobiliere) {
        System.out.println("*******save ***********");
        Imobiliere I=ImobiliereService.SaveImobiliere(imobiliere);
        System.out.println("*******"+I.getRef());
        return I ;
    }
    @GetMapping("/Imobiliere/{id}")
    Imobiliere getImobiliere(@PathVariable Long id) {
        return ImobiliereService.getImobiliere(id);
    }

    @GetMapping("/Imobilieres")
    List<Imobiliere> getListImobiliere() {
        return ImobiliereService.getListImobiliere();
    }
    @PostMapping("/Imobiliere/update")
    public Imobiliere updateImobiliere(@RequestBody Imobiliere imobiliere) {
        return ImobiliereService.updateImobiliere(imobiliere);
    }

    @GetMapping("/Imobiliere/delete/{id}")
    public boolean deleteImobiliere(@PathVariable Long id) {
        ImobiliereService.deleteImobiliere(id);
        return true;
    }
    @GetMapping("/AnnonceValide")
    Imobiliere getAnnonceValide() {
        return ImobiliereService.annonceValide();
    }

    @PostMapping("/Imobiliere/updateStatut")
    public Imobiliere updateImobiliereStatut(@RequestBody Imobiliere imobiliere) {
        Imobiliere imobiliere1 =new Imobiliere();
        imobiliere1.setStatut(imobiliere.getStatut());
        return ImobiliereService.SaveImobiliere(imobiliere);

    }
}
