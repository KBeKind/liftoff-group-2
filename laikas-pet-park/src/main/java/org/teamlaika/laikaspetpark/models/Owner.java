package org.teamlaika.laikaspetpark.models;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

public class Owner extends User {


    @Size(min=3,message = "name must be at least 3 characters long")
    private String name;
    @Email(message = "Must be a valid email address")
    private String email;

    @OneToMany(mappedBy = "pet")
    private final List<Pet> pets = new ArrayList<>();
    public String getName() {return name;}

    public void setName(String name){this.name = name;}

    public List<Pet> getPets(){return pets;}

    @Override
    public String toString(){return name;}
}
