package com.tubz.springbootmongodb.controller;

import com.tubz.springbootmongodb.models.Project;
import com.tubz.springbootmongodb.models.Task;
import com.tubz.springbootmongodb.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping
    public ResponseEntity<Project> findProject(@RequestParam String id) {

        return ResponseEntity.status(HttpStatus.OK).body(projectService.findProject(id));
    }

    @GetMapping(path = "/findTask")
    public ResponseEntity<Task> findTask(@RequestParam String id) {

        return ResponseEntity.status(HttpStatus.OK).body(projectService.findTask(id));
    }

    @DeleteMapping(path = "/deleteTask")
    public ResponseEntity<String> deleteTask(@RequestParam String id) {
        projectService.deleteTask(id);
        return ResponseEntity.status(HttpStatus.OK).body(id);
    }
}
