package com.spring.mongo.api.model;


import com.fasterxml.jackson.annotation.JsonIgnore;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Tutor")
public class Tutor {

	@Id
	private static Long id=0l;
	private String firstName;
	private String lastName; 
	private String email; 
	private String address;
	private String phone;
	private String dob;
	
	@JsonIgnore
	private Department department;
	
	public Tutor() {
		this.id=id+1;
	}

	public Tutor(String firstName, String lastName, String email,String address, String phone, String dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address= address;
		this.phone = phone;
		this.dob= dob;

	}


	public Tutor(String firstName, String lastName, String email,String address, String phone, String dob, Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address= address;
		this.phone = phone;
		this.dob= dob;		
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	
	@Override
	public String toString() {
		return "Tutor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + ", dob=" + dob + ", department=" + department + "]";
	}

	
	
}