package com.spring.mongo.api.model;



import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Department")
public class Department {
	
	@Id
	private static Long departmentid=0l;
	private String name;
	
	private List<Tutor> tutors;
	
	public Department() {
		super();
		this.departmentid=departmentid+1;
	}
	
	public Department(String name) {
		super();
		this.name = name;
	}
	
	public Long getDepartmentid() {
		return departmentid;
	}
	
	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public List<Tutor> gettutors() {
		return tutors;
	}

	public void setTutors(List<Tutor> tutors) {
		this.tutors = tutors;
	}


}
