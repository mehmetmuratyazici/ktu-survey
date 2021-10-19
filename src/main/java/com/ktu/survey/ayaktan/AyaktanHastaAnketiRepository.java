package com.ktu.survey.ayaktan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ktu.survey.models.AyaktanHastaAnketi;
import java.util.Optional;

@Repository
public interface AyaktanHastaAnketiRepository extends JpaRepository<AyaktanHastaAnketi, Long> {

    Optional<AyaktanHastaAnketi> findAyaktanHastaAnketiById(Long id);

}
