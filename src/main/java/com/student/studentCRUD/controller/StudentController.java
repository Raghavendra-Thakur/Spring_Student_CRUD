package com.student.studentCRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.studentCRUD.DAO.StudentRepo;
import com.student.studentCRUD.Exception.UserNotFoundException;
import com.student.studentCRUD.entiity.Student;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	//getAllStudent method is for getting all students in DB
	
	@GetMapping(value = "/students")
	public List<Student> getAllStudent() {
		
		List<Student> students = studentRepo.findAll();
		
		return students;
	}
	
	// inserStudent() this method is for inserting new Student into to db
	@PostMapping(value = "/students")
	public Student insertStudent(@Valid @RequestBody Student student) {
		Student std = studentRepo.save(student);
		
		return std;
	}
	
	//getStudentById method is to get single Stundent By Id
	
	@GetMapping(value = "students/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
			
			return studentRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found With Requested ID "+id));
		
	}
	
	//updateStudent this method is for updating student information
	
	@PutMapping(value = "/students/update/{id}")
	private Student updateStudent(@PathVariable("id") int id ,@Valid @RequestBody Student std) {
		
		Student student = studentRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found With Requested ID "+id));
		
		
		student.setName(std.getName());
		student.setPhoneno(std.getPhoneno());
		student.setDivision(std.getDivision());
		
		studentRepo.save(student);
		
		
		return studentRepo.findById(student.getId()).get();
		
	}
	
	// deleteStudent() this method is for deletting student data
	@DeleteMapping(value = "/students/delete/{id}")
	public Student deleteStudent(@PathVariable("id") int id ) {
		Student student = studentRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User Not Found With Requested ID "+id));
		
		studentRepo.deleteById(id);
		
		return student;
	}
	
}
