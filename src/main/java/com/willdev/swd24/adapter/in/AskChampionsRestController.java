package com.willdev.swd24.adapter.in;

import com.willdev.swd24.application.AskChampionsUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


@Tag(name = "Campeões", description = "Endpoints do domínio de campeões do LoL.")
@RestController
@RequestMapping("/champions")
public record AskChampionsRestController(AskChampionsUseCase useCase) {

    @PostMapping("/{championsId}/ask")
    public AskChampionsResponse askChampions (@PathVariable Long championsId, @RequestBody AskChampionsRequest request) {

        String answer = useCase().askChampion(championsId, request.question());

        return new AskChampionsResponse(answer);

    }

    public record AskChampionsRequest(String question) {}
    public record AskChampionsResponse(String answer) {}


}
