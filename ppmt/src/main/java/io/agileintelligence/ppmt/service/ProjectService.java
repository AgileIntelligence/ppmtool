package io.agileintelligence.ppmt.service;

import io.agileintelligence.ppmt.domain.Project;
import io.agileintelligence.ppmt.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveProject(Project project){
        //logic


        return projectRepository.save(project);
    }

}
