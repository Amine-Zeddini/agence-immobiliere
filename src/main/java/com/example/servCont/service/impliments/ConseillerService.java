package com.example.servCont.service.impliments;

import com.example.persistance.dao.AgenceRepository;
import com.example.persistance.dao.ConseillerRepository;
import com.example.persistance.entity.Conseiller;
import com.example.servCont.service.interfaces.IConseiller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConseillerService implements IConseiller {
    @Autowired
    ConseillerRepository conseillerRepository;

    @Override
    public Conseiller SaveConseiller(Conseiller conseiller) {
       return conseillerRepository.save(conseiller);
    }

    @Override
    public Conseiller updateConseiller(Conseiller conseiller) {

        return conseillerRepository.saveAndFlush(conseiller);
    }

    @Override
    public boolean deleteConseiller(Long id) {

        conseillerRepository.deleteById(id);
        return true;
    }

    @Override
    public List<Conseiller> getListConseiller() {

        return  conseillerRepository.findAll();
    }

    @Override
    public Conseiller getConseiller(long id) {
       return conseillerRepository.findById(id).get();
    }

    @Override
    public Conseiller findConseillerByName(String name) {
        return  conseillerRepository.findByNom(name);
    }

    @Override
    public int getQuantityOfConseiller() {
        return conseillerRepository.getQuantityOfConseiller();
    }
}
