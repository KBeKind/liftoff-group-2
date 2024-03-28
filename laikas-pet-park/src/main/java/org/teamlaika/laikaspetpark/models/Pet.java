package org.teamlaika.laikaspetpark.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

import java.util.Objects;

public class Pet {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @ManyToOne
    private Owner owner;
    private String species;
    private String breed;
    private String description;



    public Pet(String aname, String aspecies, String abreed, String adescription, Owner powner){
        //this();
        this.name = aname;
        this.species = aspecies;
        this.breed = abreed;
        this.description = adescription;
        this.owner = powner;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
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
