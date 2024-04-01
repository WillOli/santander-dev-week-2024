package com.willdev.swd24.application;

import com.willdev.swd24.domain.model.Champions;
import com.willdev.swd24.ports.ChampionsRepository;

import java.util.List;

public record ListChampionsUseCase(ChampionsRepository repository) {

    public List<Champions> findAll() {
        return repository.findAll();
    }
}
