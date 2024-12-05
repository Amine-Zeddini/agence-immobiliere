package com.example.persistance.dao;

import com.example.persistance.entity.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConseillerRepository extends JpaRepository<Conseiller,Long> {
    Conseiller findByNom(String nom);
    @Query(value = "select count(*) from conseiller",nativeQuery = true)
    int getQuantityOfConseiller();
}
