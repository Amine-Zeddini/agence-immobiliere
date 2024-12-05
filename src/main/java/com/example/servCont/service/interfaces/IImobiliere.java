package com.example.servCont.service.interfaces;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;

import java.util.List;

public interface IImobiliere {
    Imobiliere SaveImobiliere(Imobiliere imobiliere);

    Imobiliere updateImobiliere(Imobiliere imobiliere);

    boolean deleteImobiliere(Long id);
    List<Imobiliere> getListImobiliere();
    Imobiliere getImobiliere(long id);
    Imobiliere annonceValide();
}
