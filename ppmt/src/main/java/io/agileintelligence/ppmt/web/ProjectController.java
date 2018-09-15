package io.agileintelligence.ppmt.web;


import io.agileintelligence.ppmt.domain.Project;
import io.agileintelligence.ppmt.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@RequestBody Project project){
        Project newProject = projectService.saveProject(project);

        return new ResponseEntity<Project>(newProject, HttpStatus.CREATED);
    }
}
