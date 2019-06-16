package br.edu.utfpr.atividade2.model;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
@Data
@ToString
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "idade")
    private int age;

    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

