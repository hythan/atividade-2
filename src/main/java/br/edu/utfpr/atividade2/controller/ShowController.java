package br.edu.utfpr.atividade2.controller;

import br.edu.utfpr.atividade2.model.Show;
import br.edu.utfpr.atividade2.model.repository.ShowRepository;
import br.edu.utfpr.atividade2.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/shows")
public class ShowController {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    ShowService showService;

    @GetMapping("/guarapuava")
    public ResponseEntity<Iterable<Show>> findAllInGuarapuava(){
        Iterable<Show> shows = showService.findAllInGuarapuava();
        return ResponseEntity.status(HttpStatus.OK).body(shows);
    }

    @GetMapping
    public ResponseEntity<Iterable<Show>> all(){
        Iterable<Show> shows = showService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(shows);
    }
}
