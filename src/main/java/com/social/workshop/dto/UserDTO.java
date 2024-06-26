package com.social.workshop.dto;

import com.social.workshop.domain.User;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

public record UserDTO(@NotBlank String name, @NotBlank String email) implements Serializable {

    private static final long serialVersionUID = 1L;

    public UserDTO(User user) {
        this(user.getName(),user.getEmail());
    }


}
