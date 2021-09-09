package com.example.demo;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.MongoRepository;
@EnableMongoRepositories
public interface MicroRepository extends MongoRepository<Empp, String>{

}
