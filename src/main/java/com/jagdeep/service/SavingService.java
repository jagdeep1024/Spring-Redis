package com.jagdeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jagdeep.model.Student;
import com.jagdeep.repository.StudentRepository;

@Service
public class SavingService {
	@Autowired
	Student student;

	@Autowired
	StudentRepository studentRepository;

	public void saveData() {
		Student student = new Student("Jagdeep Singh", Student.Gender.MALE, 1);
		studentRepository.save(student);
	}
}
