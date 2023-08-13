package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.ApiResponse;
import com.app.entities.Student;
import com.app.exception_handler.ResourceNotFoundException;
import com.app.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studrepo;

	@Override
	public List<Student> getAllStudents() {
		
		return studrepo.findAll();
	}

	@Override
	public ApiResponse addStudDetail(Student transientStud) {
		String msg="Adding Student Failed";
		Student stud=studrepo.save(transientStud);
		if(stud != null)
		{
			msg="Student added Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateStud(Student detachedStud) {
		
		String msg="Updating Student Failed";
		Student stud=studrepo.save(detachedStud);
		if(stud != null)
		{
			msg="Student details updated Successflly";
		}
		return new ApiResponse(msg);
	}

	@Override
	public Student getStudent(Long id) {
		
			return studrepo.findById(id)
					.orElseThrow(()->new ResourceNotFoundException("invalid id"));
		
		
	}

	@Override
	public String removeStudent(Long id) {
		String mesg="Id invalid cannot delete record";
		if(studrepo.existsById(id))
		{
			studrepo.deleteById(id);
			mesg="Deleted Successfully";
		}
		
		return mesg;
		
	}

}
