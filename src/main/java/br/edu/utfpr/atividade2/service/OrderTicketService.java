package br.edu.utfpr.atividade2.service;

import br.edu.utfpr.atividade2.model.OrderTicket;
import br.edu.utfpr.atividade2.model.User;
import br.edu.utfpr.atividade2.model.dto.UserDTO;
import br.edu.utfpr.atividade2.model.repository.OrderTicketRepository;
import br.edu.utfpr.atividade2.model.repository.ShowRepository;
import br.edu.utfpr.atividade2.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderTicketService {

    @Autowired
    OrderTicketRepository orderTicketRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    ShowRepository showRepository;

    public void init() {

        OrderTicket orderTicket = new OrderTicket(1,
                200L,
                userRepository.findById(1L).get(),
                showRepository.getOne(1L));

        OrderTicket orderTicket2 = new OrderTicket(5,
                1000L,
                userRepository.findById(1L).get(),
                showRepository.getOne(1L));


        OrderTicket orderTicket3 = new OrderTicket(10,
                5000L,
                userRepository.findById(4L).get(),
                showRepository.getOne(1L));
        OrderTicket orderTicket4 = new OrderTicket(1,
                3000L,
                userRepository.findById(3L).get(),
                showRepository.getOne(2L));

        ArrayList<OrderTicket> orderTickets = new ArrayList<>();
        orderTickets.add(orderTicket);
        orderTickets.add(orderTicket2);
        orderTickets.add(orderTicket3);
        orderTickets.add(orderTicket4);


        orderTicketRepository.saveAll(orderTickets);
    }

    public UserDTO getMajorDonationValue(){
        OrderTicket orderTicket =  orderTicketRepository.getUserMajorValueDonation(new Sort(Sort.Direction.DESC,"donationValue")).get(0);
        User user =  orderTicketRepository.getUserMajorValueDonation(new Sort(Sort.Direction.DESC,"donationValue")).get(0).getUser();
        UserDTO userDTO =  new UserDTO(
                user.getName(),
                orderTicket.getQuantity(),
                orderTicket.getDonationValue()
                );
        return userDTO;
    }

    public Iterable<OrderTicket> findAllByUserId(Long user_id) {
        return orderTicketRepository.findByUserId(user_id);
    }

    public List<User> getAllUserByShowId(Long id){
        return orderTicketRepository.getAllUserByShow(id);
    }
}
