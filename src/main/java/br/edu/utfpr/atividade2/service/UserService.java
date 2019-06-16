package br.edu.utfpr.atividade2.service;

import br.edu.utfpr.atividade2.model.User;
import br.edu.utfpr.atividade2.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findByFirstName(String name){
        return userRepository.findByNameStartsWith(name,new Sort("age"));
    }


}
