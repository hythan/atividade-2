package br.edu.utfpr.atividade2.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Table(name = "shows")
@Entity
@Data
@ToString
@NoArgsConstructor
public class Show {

    @Id
    private Long id;

    @Column(name = "data")
    private Date date;

    @Column(name = "banda")
    private String band;

    @ManyToOne
    private EventLocation eventLocation;

    public Show(Long id, Date date, String band) {
        this.id = id;
        this.date = date;
        this.band = band;
    }
}
