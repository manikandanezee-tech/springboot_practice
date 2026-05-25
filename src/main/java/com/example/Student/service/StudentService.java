package com.example.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Student.models.Student;
import com.example.Student.repo.StudentRepo;

@Service
public class StudentService {
@Autowired
private StudentRepo studentRepo;

public List<Student> studentList() {
	return studentRepo.findAll();
}

public String addStudent(Student[] student) {
	int count=0;
	for(int i=0;i<student.length;i++) {
	if(student[i].getId()!=0 && !studentRepo.existsById(student[i].getId())) {
	studentRepo.save(student[i]);
	count++;
	}
	
}
	if(count>0) {
		return "Successfully "+count+" Student added...";
	}
	return "Oops sorry failed to add...";}

public String deleteStudent(int id) {
	if(studentRepo.existsById(id)) {
		studentRepo.deleteById(id);
		return "Successfully deleted";
	}
	return "student Not found";
}

public String updateStudent(Student student) {
	if(studentRepo.existsById(student.getId())) {
		studentRepo.save(student);
		return "Successfully Updated...";
	}
	return "Student not found";
}

}
