package com.spring.mongo.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.spring.mongo.api.model.Department;
import com.spring.mongo.api.model.Student;
import com.spring.mongo.api.model.Tutor;
import com.spring.mongo.api.model.User;
import com.spring.mongo.api.repository.DepartmentRepository;
import com.spring.mongo.api.repository.StudentRepository;
import com.spring.mongo.api.repository.TutorRepository;
import com.spring.mongo.api.repository.UserRepository;

@SpringBootApplication
public class SpringMongodbApplication extends SpringBootServletInitializer {
	
	private static final Logger log = LoggerFactory.getLogger(SpringMongodbApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner tutorDemo(TutorRepository repository,DepartmentRepository drepository,UserRepository urepository, StudentRepository srepository) {
		return (args) -> {
			log.info("save a couple of Departments");
			Department d1 = new Department("IT");
			Department d2 = new Department("CSE");
			Department d3 = new Department("MECH");
			Department d4 = new Department("CIVIL");
			Department d5 = new Department("EIE");
			drepository.save(d1);
			drepository.save(d2);
			drepository.save(d3);
			drepository.save(d4);
			drepository.save(d5);
			
			log.info("save some tutors");
			repository.save(new Tutor("ABC", "Vicnet", "abc@gmail.com", "Chennai, India", "0456892342", "2000-02-12", d1));
			repository.save(new Tutor("Wanda", "Cap", "wanda@yahoo.com", "Riverdale, Canada", "0406012345", "2000-08-19", d2));
			repository.save(new Tutor("Sample", "Data", "sample@haaga.com", "Tokyo, HG", "123456", "1983-05-10", d3));
			
			
			log.info("save some students");
			srepository.save(new Student("Manoj", "V", "manoj@yahoo.com", "3rd", "0456892342", d1));
			srepository.save(new Student("Hello", "hj", "ai@gmail.com", "1st", "047612323", d4));
			srepository.save(new Student("Stark", "K", "stark@helia.com", "3rd", "0458923894", d2));
			
			log.info("Create users");
			urepository.save(new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER"));
			urepository.save(new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN"));
			
			log.info("fetch all tutors");
			for (Tutor tutor : repository.findAll()) {
				log.info(tutor.toString());
			}
			
		};
	}*/
			
	
}
