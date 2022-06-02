package com.tubz.springbootmongodb.repository;

import com.tubz.springbootmongodb.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
