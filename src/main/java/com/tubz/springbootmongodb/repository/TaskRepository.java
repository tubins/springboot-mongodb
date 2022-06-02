package com.tubz.springbootmongodb.repository;

import com.tubz.springbootmongodb.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
