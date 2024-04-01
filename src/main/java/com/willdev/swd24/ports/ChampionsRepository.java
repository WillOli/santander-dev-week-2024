package com.willdev.swd24.ports;

import com.willdev.swd24.domain.model.Champions;

import java.util.List;
import java.util.Optional;

public interface ChampionsRepository {

    List<Champions> findAll();
    Optional<Champions> findById(Long id);
}
