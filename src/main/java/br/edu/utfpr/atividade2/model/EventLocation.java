package br.edu.utfpr.atividade2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Table(name = "local_eventos")
@Entity
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EventLocation {

    public EventLocation(Date startDate, Date endDate, String city) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.city = city;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data_inicio")
    private Date startDate;

    @Column(name = "data_fim")
    private Date endDate;

    @Column(name = "cidade")
    private String city;
}
