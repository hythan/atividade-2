package br.edu.utfpr.atividade2.model.repository;

import br.edu.utfpr.atividade2.model.EventLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventLocationRepository extends JpaRepository<EventLocation, Long> {

    EventLocation findByCity(String city);
}
