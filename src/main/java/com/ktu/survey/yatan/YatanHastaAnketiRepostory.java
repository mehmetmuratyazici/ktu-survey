package com.ktu.survey.yatan;

import com.ktu.survey.models.YatanHastaAnketi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface YatanHastaAnketiRepostory extends JpaRepository<YatanHastaAnketi, Long> {

    Optional<YatanHastaAnketi> findYatanHastaAnketiById(Long aLongid);
    
}
