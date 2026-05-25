package com.example.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Student.models.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}
