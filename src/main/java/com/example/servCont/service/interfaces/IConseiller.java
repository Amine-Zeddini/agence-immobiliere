package com.example.servCont.service.interfaces;

import com.example.persistance.entity.Conseiller;

import java.util.List;

public interface IConseiller {
    Conseiller SaveConseiller(Conseiller conseiller);

    Conseiller updateConseiller(Conseiller conseiller);

    boolean deleteConseiller(Long id);
    List<Conseiller> getListConseiller();
    Conseiller getConseiller(long id);
    Conseiller findConseillerByName(String name);
    int getQuantityOfConseiller();
}
