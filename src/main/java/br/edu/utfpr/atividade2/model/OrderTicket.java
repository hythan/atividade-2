package br.edu.utfpr.atividade2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "pedido_ingressos")
@ToString
@Data
@NoArgsConstructor

public class OrderTicket {

    @Id
    private Long id;

    @Column(name = "quantidade")
    private int quantity;

    @Column(name = "valor_doacao")
    private Long DonationValue;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;
}
