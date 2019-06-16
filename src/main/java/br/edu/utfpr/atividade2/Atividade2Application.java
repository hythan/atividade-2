package br.edu.utfpr.atividade2;

import br.edu.utfpr.atividade2.service.OrderTicketService;
import br.edu.utfpr.atividade2.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Atividade2Application {
	@Autowired
	ShowService showService;

	@Autowired
	OrderTicketService orderTicketService;

	public static void main(String[] args) {
		SpringApplication.run(Atividade2Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
		    showService.init();
		    orderTicketService.init();
		};
	}
}
