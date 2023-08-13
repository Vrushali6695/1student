package com.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.ApiResponse;
import com.app.entities.Student;

public interface StudentService {
	
	//get
	List<Student> getAllStudents();

	//add
	ApiResponse addStudDetail(Student transientStud);

	//update
	ApiResponse updateStud(Student detachedStud);

	//find by  id
	Student getStudent(Long id);
	
	//delete by id
	String removeStudent(Long id);
	
	

}
