package br.edu.utfpr.atividade2.model.repository;

import br.edu.utfpr.atividade2.model.OrderTicket;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long>{


    @Query("select t from OrderTicket t")
    List<OrderTicket> getUserMajorValueDonation(Sort sort);

}
