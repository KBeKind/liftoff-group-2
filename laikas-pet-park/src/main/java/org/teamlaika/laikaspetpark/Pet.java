package org.teamlaika.laikaspetpark;

import java.util.Objects;

public class Pet {
    private int id;
    private static int nextId = 1;
    private String name;
    private String owner;
    private String species;
    private String breed;
    private String description;

    public Pet(){
        id = nextId;
        nextId++;
    }

    public Pet(String aname, String aspecies, String abreed, String adescription, Account powner){
        this();
        this.name = aname;
        this.species = aspecies;
        this.breed = abreed;
        this.description = adescription;
        this.owner = powner.getDisplayName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getId() == pet.getId() && Objects.equals(getName(), pet.getName()) && Objects.equals(getOwner(), pet.getOwner()) && Objects.equals(getSpecies(), pet.getSpecies()) && Objects.equals(getBreed(), pet.getBreed()) && Objects.equals(getDescription(), pet.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOwner(), getSpecies(), getBreed(), getDescription());
    }
}
