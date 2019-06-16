package br.edu.utfpr.atividade2.service;

import br.edu.utfpr.atividade2.model.Show;
import br.edu.utfpr.atividade2.model.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    public void  init(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,8, 22);

        Show s1 = new Show(1L,calendar.getTime() ,"Roupa Nova");
        calendar.set(2019,2, 15);
        Show s2 = new Show(2L, calendar.getTime(),"Linkin Park");

        ArrayList<Show> shows = new ArrayList<>();
        shows.add(s1);
        shows.add(s2);

        showRepository.saveAll(shows);
    }
}
