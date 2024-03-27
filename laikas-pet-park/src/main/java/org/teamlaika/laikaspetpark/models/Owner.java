package org.teamlaika.laikaspetpark.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner extends User {


//    @OneToMany(mappedBy = "pet")
//    private final List<Pet> pets = new ArrayList<>();
}
