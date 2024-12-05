package com.example.servCont.service.impliments;

import com.example.persistance.dao.ImobiliereRepository;
import com.example.persistance.dao.ProprietaireRepository;
import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;
import com.example.servCont.service.interfaces.IImobiliere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImobiliereService implements IImobiliere {
    @Autowired
    ImobiliereRepository imobiliererepository;

    @Override
    public Imobiliere SaveImobiliere(Imobiliere imobiliere) {
        return imobiliererepository.save(imobiliere);
    }

    @Override
    public Imobiliere updateImobiliere(Imobiliere imobiliere) {
        return imobiliererepository.saveAndFlush(imobiliere);

    }

    @Override
    public boolean deleteImobiliere(Long id) {
        imobiliererepository.deleteById(id);
        return true;
    }

    @Override
    public List<Imobiliere> getListImobiliere() {
        return  imobiliererepository.findAll();
    }

    @Override
    public Imobiliere getImobiliere(long id) {
        return  imobiliererepository.findById(id).get();
    }

    @Override
    public Imobiliere annonceValide() {
        return imobiliererepository.getAnnonceValide();
    }





}
