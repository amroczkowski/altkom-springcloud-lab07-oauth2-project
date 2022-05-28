package pl.altkom.springcloud.lab07.oauth2.projectservice.client.model;

import lombok.Data;

@Data
public class Employee {

    private Long id;

    private String firstName;
    private String lastName;
    private String city;
    private Long projectId;
}
