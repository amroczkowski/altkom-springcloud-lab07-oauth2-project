package pl.altkom.springcloud.lab07.oauth2.projectservice.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class UpdateProjectRequest {

    @NotNull
    private String name;
}
