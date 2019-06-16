package br.edu.utfpr.atividade2.controller;

import br.edu.utfpr.atividade2.model.OrderTicket;
import br.edu.utfpr.atividade2.model.Show;
import br.edu.utfpr.atividade2.service.OrderTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/pedido-ingresso")
public class OderTicketController {

    @Autowired
    OrderTicketService orderTicketService;

    @GetMapping("/ingressos-do-usuario")
    public ResponseEntity<Iterable<OrderTicket>> findAllByUserId(@RequestParam(value = "id") Long user_id){
        Iterable<OrderTicket> orderTickets = orderTicketService.findAllByUserId(user_id);
        return ResponseEntity.status(HttpStatus.OK).body(orderTickets);
    }
}
