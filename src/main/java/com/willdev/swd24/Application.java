package com.willdev.swd24;

import com.willdev.swd24.application.AskChampionsUseCase;
import com.willdev.swd24.application.ListChampionsUseCase;
import com.willdev.swd24.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public ListChampionsUseCase provideListChampionsUserCase(ChampionsRepository repository) {
		return new ListChampionsUseCase(repository);
	}

	@Bean
	public AskChampionsUseCase provideAskChampionsUserCase(ChampionsRepository repository) {
		return new AskChampionsUseCase(repository);
	}

}
