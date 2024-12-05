package com.example.persistance.dao;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProprietaireRepository  extends JpaRepository<Proprietaire, Long> {


}
