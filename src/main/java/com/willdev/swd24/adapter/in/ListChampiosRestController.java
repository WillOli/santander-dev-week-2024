package com.willdev.swd24.adapter.in;

import com.willdev.swd24.application.ListChampionsUseCase;
import com.willdev.swd24.domain.model.Champions;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Tag(name = "Campeões", description = "Endpoints do domínio de campeões do LoL.")
@RestController
@RequestMapping("/champions")
public record ListChampiosRestController(ListChampionsUseCase useCase) {

    @GetMapping
    public List<Champions> findAllChampions() {
        return useCase.findAll();
    }

}
