package com.example.application.repositories;

import com.example.application.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository <User,String>{
}
