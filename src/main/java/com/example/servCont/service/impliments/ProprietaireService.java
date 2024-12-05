package com.example.servCont.service.impliments;

import com.example.persistance.dao.ProprietaireRepository;
import com.example.persistance.entity.Proprietaire;
import com.example.servCont.service.interfaces.IProprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProprietaireService implements IProprietaire {
    @Autowired
    ProprietaireRepository proprietaireRepository;


    @Override
    public Proprietaire SaveProprietaire(Proprietaire proprietaire) {
        return proprietaireRepository.save(proprietaire);
    }

    @Override
    public Proprietaire updateProprietaire(Proprietaire proprietaire) {
        return proprietaireRepository.saveAndFlush(proprietaire);
    }

    @Override
    public boolean deleteProprietaire(Long id) {
        proprietaireRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Proprietaire> getListProprietaire() {
        return  proprietaireRepository.findAll();
    }

    @Override
    public Proprietaire getProprietaire(long id) {
        return  proprietaireRepository.findById(id).get();
    }
}
