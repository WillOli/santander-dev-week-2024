package com.willdev.swd24.application;

import com.willdev.swd24.domain.exception.ChampionNotFoundException;
import com.willdev.swd24.domain.model.Champions;
import com.willdev.swd24.ports.ChampionsRepository;

public record AskChampionsUseCase(ChampionsRepository repository) {

    public String askChampion(Long championId, String question) {

        Champions champions = repository.findById(championId)
                .orElseThrow(() -> new ChampionNotFoundException(championId));

        String championContext = champions.generateContextByQuestion(question);

        // TODO: Evoluir a lógica de negócio para considerar a integração com IAs Generativas.

        return championContext;
    }
}
