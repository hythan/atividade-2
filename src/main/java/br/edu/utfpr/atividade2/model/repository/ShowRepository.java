package br.edu.utfpr.atividade2.model.repository;

import br.edu.utfpr.atividade2.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
}
