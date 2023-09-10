package com.spring.mongo.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.spring.mongo.api.model.Tutor;



public interface TutorRepository extends MongoRepository<Tutor, Long>{
	
	//Fetch by lastName
		List<Tutor> findBylastName(@Param("lastName") String lastName);
		

		 //Fetch by firstName
		List<Tutor> findByfirstName(@Param("firstName") String firstName);
		
		

}
