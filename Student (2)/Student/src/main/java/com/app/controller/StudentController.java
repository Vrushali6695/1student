package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studService;
	
	public StudentController() {
		System.out.println("in ctor of "+getClass());
	}
	
	@GetMapping
	public List<Student> showAllStudents()
	{
		return studService.getAllStudents();
	}
	
	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody Student transientStud)
	{
		return new ResponseEntity<>(studService.addStudDetail(transientStud),HttpStatus.CREATED);
	}
	
	

	@PutMapping()
	public ResponseEntity<?> updateStudent(@RequestBody Student detachedStud)
	{
		return new ResponseEntity<>(studService.updateStud(detachedStud),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public Student getById(@PathVariable Long id)
	{
		return studService.getStudent(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		return studService.removeStudent(id);
	}
	

}
