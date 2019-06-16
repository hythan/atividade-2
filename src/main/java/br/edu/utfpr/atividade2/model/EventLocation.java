package br.edu.utfpr.atividade2.model;

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

public class EventLocation {

    @Id
    private Long id;

    @Column(name = "data_inicio")
    private Date startDate;

    @Column(name = "data_fim")
    private Date endDate;

    @Column(name = "cidade")
    private String city;

    @OneToMany
    private List<Show> shows;

}
