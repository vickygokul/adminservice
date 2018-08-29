package com.example.AdminService;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
  public interface MatchRepo extends MongoRepository<Match,Integer>{

	Match findByid(int id);

	

}
