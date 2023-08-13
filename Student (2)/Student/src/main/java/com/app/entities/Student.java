package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="students")

public class Student extends BaseEntity {
	
	@Column(name="full_name",length = 30)
	private String name;
	@Column(unique = true,length=30)
	private String email;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", Id()=" + getId() + "]";
	}
	
	
	
}
