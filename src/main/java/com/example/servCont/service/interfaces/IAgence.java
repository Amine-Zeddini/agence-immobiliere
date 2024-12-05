package com.example.servCont.service.interfaces;

import com.example.persistance.entity.Agence;
import com.example.persistance.entity.Proprietaire;

public interface IAgence {
    Agence SaveAgence(Agence agence);
    Agence updateAgence(Agence agence);
}
