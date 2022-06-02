package com.tubz.springbootmongodb.controller;

import com.tubz.springbootmongodb.models.Project;
import com.tubz.springbootmongodb.models.Task;
import com.tubz.springbootmongodb.service.ProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping
    public void saveProject(@RequestBody Project project) {
        projectService.saveProject(project);
    }

    @PostMapping("/saveTask")
    public void saveTask(@RequestBody Task task) {
        projectService.saveTask(task);
    }
}
