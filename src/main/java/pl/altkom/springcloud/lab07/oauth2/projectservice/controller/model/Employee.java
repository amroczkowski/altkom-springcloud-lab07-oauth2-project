package pl.altkom.springcloud.lab07.oauth2.projectservice.controller.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Employee {
    private Long id;

    private String firstName;
    private String lastName;
    private String city;
    private Long projectId;
}