package org.teamlaika.laikaspetpark.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teamlaika.laikaspetpark.models.CatApi;
import org.teamlaika.laikaspetpark.models.DogApi;

import java.util.List;

@RestController
@RequestMapping("api/cat-breeds")
public class CatApiController {

    private final ApiService apiService;

    public CatApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("")
    public List<CatApi> findAllCats() {
        return apiService.findAllCats();
    }

    @GetMapping("/{id}")
    public CatApi findCatById(@PathVariable int id) {
        return apiService.findCatById(id);
    }
}
