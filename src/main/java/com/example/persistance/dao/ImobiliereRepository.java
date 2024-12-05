package com.example.persistance.dao;

import com.example.persistance.entity.Imobiliere;
import com.example.persistance.entity.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ImobiliereRepository extends JpaRepository<Imobiliere, Long> {
    @Query(value = "select * from imobiliere where statut=1 ",nativeQuery = true)
    Imobiliere getAnnonceValide();

}
