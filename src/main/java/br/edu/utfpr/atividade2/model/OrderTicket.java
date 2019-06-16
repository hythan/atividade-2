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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "quantidade")
    private int quantity;

    @Column(name = "valor_doacao")
    private Long donationValue;

    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    public OrderTicket(int quantity, Long donationValue, User user, Show show) {
        this.quantity = quantity;
        this.donationValue = donationValue;
        this.user = user;
        this.show = show;
    }
}
