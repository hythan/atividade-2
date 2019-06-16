package br.edu.utfpr.atividade2.model.repository;

import br.edu.utfpr.atividade2.model.OrderTicket;
import br.edu.utfpr.atividade2.model.Show;
import br.edu.utfpr.atividade2.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderTicketRepository extends JpaRepository<OrderTicket, Long>{


    @Query("select t from OrderTicket t")
    List<OrderTicket> getUserMajorValueDonation(Sort sort);

    List<OrderTicket> findByUserId(Long userId);

    @Query("select distinct t.user from OrderTicket t where t.show.id=?1")
    List<User> getAllUserByShow(Long id);

    @Query("select distinct t.show from OrderTicket  t where t.quantity >= 3 and t.quantity <= 5")
    List<Show> getShowsWithUsersBetween3And5();

}
