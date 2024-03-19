package org.teamlaika.laikaspetpark.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pet")
public class PetController {

    private final DogApiService dogApiService;

    public PetController(DogApiService dogApiService) {
        this.dogApiService = dogApiService;
    }

    @GetMapping("create")
    public String displayForm(Model model) {
        model.addAttribute("title","Select a Breed");
        model.addAttribute("breeds", dogApiService.findAll());
        return "selector";
    }
}
