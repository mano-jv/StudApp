package com.spring.mongo.api.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.api.model.Department;


public interface DepartmentRepository extends MongoRepository<Department, Long>{
	

    List<Department> findByName(String name);		

}
