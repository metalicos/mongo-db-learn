package com.mongodb.learn.repository;

import com.mongodb.learn.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends MongoRepository<User, Integer> {

    Optional<User> findByEmail(String email);

    Optional<List<User>> findBySport_SportName(String sportName);
}
