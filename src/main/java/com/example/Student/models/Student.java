package com.example.Student.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
private int id;
	@Column(length = 50)
private String name;
	@Column(length = 50)
private String dept;
	@Column(length = 50)
private String year;
}
