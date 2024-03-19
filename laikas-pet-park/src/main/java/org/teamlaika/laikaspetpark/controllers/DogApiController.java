package org.teamlaika.laikaspetpark.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teamlaika.laikaspetpark.models.Breed;

import java.util.List;

@RestController
@RequestMapping("api/breeds")
public class DogApiController {

    private final DogApiService dogApiService;

    public DogApiController(DogApiService dogApiService) {
        this.dogApiService = dogApiService;
    }

    @GetMapping("")
    public List<Breed> findAll() {
        return dogApiService.findAll();
    }

}
