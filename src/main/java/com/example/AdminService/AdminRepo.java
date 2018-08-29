package com.example.AdminService;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {

	public Admin findByUsername(String username);

}
