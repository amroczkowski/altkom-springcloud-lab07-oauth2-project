package pl.altkom.springcloud.lab07.oauth2.projectservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import pl.altkom.springcloud.lab07.oauth2.projectservice.client.model.Employee;

@FeignClient(value = "EMPLOYEE-SERVICE")
public interface EmployeeClient {

    @GetMapping("/employee/project/{projectId}")
    List<Employee> getProjectEmployees(@PathVariable("projectId") final Long projectId);

    @GetMapping("/employee")
    List<Employee> getEmployees();
}
