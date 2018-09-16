package io.agileintelligence.ppmt.repository;


import io.agileintelligence.ppmt.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Project findByProjectIdentifier(String projectid);
    Iterable<Project> findAll();


}
