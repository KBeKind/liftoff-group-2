package org.teamlaika.laikaspetpark.models;

public class Breed {

    private int id;

    private String name;

    public Breed(int breedId, String name) {
        this.id = breedId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int breedId) {
        this.id = breedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
