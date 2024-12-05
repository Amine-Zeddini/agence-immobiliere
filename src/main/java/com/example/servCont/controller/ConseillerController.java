package com.example.servCont.controller;

import com.example.persistance.entity.Conseiller;
import com.example.persistance.entity.Imobiliere;
import com.example.servCont.service.interfaces.IConseiller;
import com.example.servCont.service.interfaces.IImobiliere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ConseillerController {
    @Autowired
    IConseiller ConseillerService;

    @PostMapping("/Conseiller/save")
    Conseiller save(@RequestBody Conseiller Conseiller) {
        System.out.println("*******save ***********");
        Conseiller c=ConseillerService.SaveConseiller(Conseiller);
        System.out.println("*******"+c.getPrenom());
        return c ;
    }
    @PostMapping("/Conseiller/update")
    public Conseiller updateConseiller(@RequestBody Conseiller conseiller) {
        return ConseillerService.updateConseiller(conseiller);
    }

    @GetMapping("/Conseiller/{id}")
    Conseiller getConseiller(@PathVariable Long id) {
        return ConseillerService.getConseiller(id);
    }

    @GetMapping("/Conseiller")
    List<Conseiller> getListConseiller() {
        return ConseillerService.getListConseiller();
    }

    @GetMapping("/Conseiller/delete/{id}")
    public boolean deleteImobiliere(@PathVariable Long id) {
        ConseillerService.deleteConseiller(id);
        return true;
    }
    @GetMapping("/ConseillerQuantity")
    int getQuantityConseiller() {
        return ConseillerService.getQuantityOfConseiller();
    }

    @GetMapping("/conseillerByName/{name}")
    Conseiller getConseillerByName(@PathVariable String name) {
        return ConseillerService.findConseillerByName(name);
    }
}
