package com.spring.mongo.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.spring.mongo.api.model.Student;


public interface StudentRepository extends MongoRepository<Student, Long>{
	
	 //Fetch by lastName
		List<Student> findBylastName(@Param("lastName") String lastName);
		

		 //Fetch by firstName
		List<Student> findByfirstName(@Param("firstName") String firstName);
		

}
