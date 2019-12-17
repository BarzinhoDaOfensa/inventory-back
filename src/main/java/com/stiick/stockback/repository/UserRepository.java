package com.stiick.stockback.repository;

import com.stiick.stockback.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
