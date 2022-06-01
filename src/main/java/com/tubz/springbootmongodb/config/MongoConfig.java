package com.tubz.springbootmongodb.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.tubz.springbootmongodb.repository")
public class MongoConfig extends AbstractMongoClientConfiguration {
    @Value("${tubz.mongodb.replicaSet}")
    public String replicaSet;
    @Value("${tubz.mongodb.replicaSet.username}")
    public String username;
    @Value("${tubz.mongodb.replicaSet.password}")
    public String password;
    @Value("${tubz.mongodb.replicaSet.primary}")
    public String primary;
    @Value("${tubz.mongodb.replicaSet.database}")
    public String database;
    @Value("${tubz.mongodb.replicaSet.port}")
    public String port;
    @Value("${tubz.mongodb.replicaSet.maxPoolSize}")
    public String maxPoolSize;
    @Value("${tubz.mongodb.replicaSet.authenticationDatabase}")
    public String authenticationDatabase;
    @Value("${tubz.mongodb.replicaSet.authMechanism}")
    public String authMechanism;

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://" + username + ":" + password + "@" + primary + ":" + port + "/" + database
                + "?replicaSet=" + replicaSet + "&authSource=" + authenticationDatabase + "maxPoolSize=" + maxPoolSize + "&authMechanism=" + authMechanism + "&ssl=false");
    }

    @Override
    protected String getDatabaseName() {
        return database;
    }
}
