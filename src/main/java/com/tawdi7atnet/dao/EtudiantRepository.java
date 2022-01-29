package com.tawdi7atnet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tawdi7atnet.entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

  Etudiant findByfirstName(String firstName);
}
