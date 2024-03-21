package org.teamlaika.laikaspetpark.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.teamlaika.laikaspetpark.models.Pet;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("pet")
public class PetController {

    private static List<Pet> pets = new ArrayList<>();
    private final ApiService apiService;

    public PetController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping
    public String displayAllPets(Model model) {
        model.addAttribute("pets", pets);
        return "index";
    }

    @GetMapping("create-dog")
    public String displayCreatePetForm(Model model) {
        model.addAttribute("dogBreeds", apiService.findAllDogs());
        return "create";
    }

    @PostMapping("create-dog")
    public String processCreatePetForm(@RequestParam String name, String breed) {
        String species = "dog";
        pets.add(new Pet(name, species, breed));
        return "redirect:create";
    }
}
