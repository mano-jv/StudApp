package com.spring.mongo.api.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document(collection = "Student")
public class Student {
	
	@Id
	private static Long id=0l;
	private String firstName;
	private String lastName; 
	private String email; 
	private String semester;
	private String phone;
	
	  @JsonIgnore
	  private Department department;
	  
	  
	  public Student() {
		  this.id=id+1;
		}
	  
	public Student(String firstName, String lastName, String email,String semester, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.semester= semester;
		this.phone = phone;	

	}

	public Student(String firstName, String lastName, String email,String semester, String phone, Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.semester= semester;
		this.phone = phone;		
		this.department = department;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", semester=" + semester + ", phone=" + phone + ", department=" + department + "]";
	}


}
