package org.teamlaika.laikaspetpark.models;

import jakarta.validation.constraints.NotNull;

public class User extends AbstractEntity {
    @NotNull
    private String username;

    @NotNull
    private String password;
}
