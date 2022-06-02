package com.tubz.springbootmongodb.service;

import com.tubz.springbootmongodb.models.Project;
import com.tubz.springbootmongodb.models.Task;

public interface ProjectService {
    void saveProject(Project project);
    void saveTask(Task task);
}
