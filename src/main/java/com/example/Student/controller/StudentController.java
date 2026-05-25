package com.example.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.models.Student;
import com.example.Student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student>studentList(){
		return studentService.studentList();
	}
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student[] student) {
		return studentService.addStudent(student);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
	@PutMapping("/update")
	public String updateStudent(@RequestBody Student student) {
		
		return studentService.updateStudent(student);
	}
	
}
