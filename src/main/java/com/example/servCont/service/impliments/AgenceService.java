package com.example.servCont.service.impliments;

import com.example.persistance.dao.AgenceRepository;
import com.example.persistance.dao.ProprietaireRepository;
import com.example.persistance.entity.Agence;
import com.example.servCont.service.interfaces.IAgence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgenceService implements IAgence {
    @Autowired
    AgenceRepository agenceRepository;

    @Override
    public Agence SaveAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.saveAndFlush(agence);
    }
}
