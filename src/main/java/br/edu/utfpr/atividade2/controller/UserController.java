package br.edu.utfpr.atividade2.controller;

import br.edu.utfpr.atividade2.model.User;
import br.edu.utfpr.atividade2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/usuarios")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<Iterable<User>> all(){
        Iterable<User> users = userService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    @GetMapping("/{name}")
    public ResponseEntity<Iterable<User>> findAllByName(@PathVariable("name") String name){
        return ResponseEntity.status(HttpStatus.OK).body(userService.findByFirstName(name));
    }
}
