package com.tubz.springbootmongodb.service;

import com.tubz.springbootmongodb.models.Project;
import com.tubz.springbootmongodb.models.Task;
import com.tubz.springbootmongodb.repository.ProjectRepository;
import com.tubz.springbootmongodb.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final TaskRepository taskRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository, TaskRepository taskRepository) {
        this.projectRepository = projectRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public void saveProject(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void saveTask(Task task) {
        taskRepository.save(task);
    }
}
