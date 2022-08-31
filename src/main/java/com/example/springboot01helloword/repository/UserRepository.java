package com.example.springboot01helloword.repository;

import com.example.springboot01helloword.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
