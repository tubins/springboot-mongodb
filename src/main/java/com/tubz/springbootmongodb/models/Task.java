package com.tubz.springbootmongodb.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
public class Task {
    @Id
    private String id;
    @Field("pid")
    private String projectId;
    @Field("desc")
    private String description;
    private String name;
    private String ownerName;
    private long cost;
    @Version
    private Long version;
}
