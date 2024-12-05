package com.example.servCont.service.interfaces;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;

import java.util.List;

public interface IProprietaire {
    Proprietaire SaveProprietaire(Proprietaire proprietaire);
    Proprietaire updateProprietaire(Proprietaire proprietaire);
    boolean deleteProprietaire(Long id);
    List<Proprietaire> getListProprietaire();
    Proprietaire getProprietaire(long id);

}
