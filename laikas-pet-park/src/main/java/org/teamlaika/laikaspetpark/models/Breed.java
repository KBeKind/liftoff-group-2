package org.teamlaika.laikaspetpark.models;

public class Breed extends AbstractEntity {

    private int breedId;

    private String name;

    public Breed(int breedId, String name) {
        this.breedId = breedId;
        this.name = name;
    }

    public Breed() {}

    public int getBreedId() {
        return breedId;
    }

    public void setBreedId(int breedId) {
        this.breedId = breedId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
