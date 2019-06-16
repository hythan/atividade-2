package br.edu.utfpr.atividade2.model.repository;

import br.edu.utfpr.atividade2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
