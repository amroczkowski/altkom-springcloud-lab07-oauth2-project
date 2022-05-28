package pl.altkom.springcloud.lab07.oauth2.projectservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.altkom.springcloud.lab07.oauth2.projectservice.repository.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
