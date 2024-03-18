package org.teamlaika.laikaspetpark.controllers;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.teamlaika.laikaspetpark.models.Breed;

import java.util.List;

@Service
public class BreedService {

    private final RestClient restClient;

    public BreedService() {
        restClient = RestClient.builder()
                .baseUrl("https://api.thedogapi.com")
                .build();
    }
    public List<Breed> findAll() {
        return restClient.get()
                .uri("/v1/breeds")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Breed>>() {});
    }
}
