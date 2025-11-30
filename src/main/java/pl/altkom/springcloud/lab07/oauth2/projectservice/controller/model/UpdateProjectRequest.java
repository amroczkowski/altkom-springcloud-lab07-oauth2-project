package pl.altkom.springcloud.lab07.oauth2.projectservice.controller.model;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class UpdateProjectRequest {

    @NotNull
    private String name;
}
