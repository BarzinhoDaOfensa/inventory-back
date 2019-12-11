package com.stiick.stockback.repository;


import com.stiick.stockback.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
