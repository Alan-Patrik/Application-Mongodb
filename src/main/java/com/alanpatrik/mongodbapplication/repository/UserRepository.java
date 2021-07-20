package com.alanpatrik.mongodbapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.alanpatrik.mongodbapplication.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
