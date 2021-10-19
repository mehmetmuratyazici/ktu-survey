package com.ktu.survey.acil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.ktu.survey.models.AcilServisHastaAnketi;

@Repository
public interface AcilServisHastaRepository extends JpaRepository<AcilServisHastaAnketi, Long>{

   Optional<AcilServisHastaAnketi> findAcilServisHastaAnketiById(Long aLongid);
    
}
