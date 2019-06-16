package br.edu.utfpr.atividade2.service;

import br.edu.utfpr.atividade2.model.EventLocation;
import br.edu.utfpr.atividade2.model.Show;
import br.edu.utfpr.atividade2.model.repository.EventLocationRepository;
import br.edu.utfpr.atividade2.model.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    @Autowired
    EventLocationRepository eventLocationRepository;

    public void  init() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019,8, 22);

        Date date = new Date();

        EventLocation eventLocation = new EventLocation(date, date, "Guarapuava");
        eventLocationRepository.save(eventLocation);

        Show s1 = new Show(1L, calendar.getTime(),"Roupa Nova", eventLocation);

        calendar.set(2019,2, 15);
        Show s2 = new Show(2L, calendar.getTime(),"Linkin Park", eventLocation);

        EventLocation eventLocation2 = new EventLocation(date, date, "São Paulo");
        eventLocationRepository.save(eventLocation2);

        calendar.set(2019,11, 15);

        Show s3 = new Show(3L, calendar.getTime(),"Raça negra", eventLocation2);

        ArrayList<Show> shows = new ArrayList<>();
        shows.add(s1);
        shows.add(s2);
        shows.add(s3);

        showRepository.saveAll(shows);
    }

    public List<Show> findAllInGuarapuava() {
        Show show = new Show();
        EventLocation eventLocation = eventLocationRepository.findByCity("Guarapuava");
        show.setEventLocation(eventLocation);
        Example<Show> example = Example.of(show);
        return showRepository.findAll(example);
    }
}
