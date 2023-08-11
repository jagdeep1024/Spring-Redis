package com.jagdeep.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jagdeep.model.Student;
import com.jagdeep.repository.StudentRepository;
import com.jagdeep.service.SavingService;

@RestController
public class RestTest {
	@Autowired
	SavingService ss;

	@Autowired
	StudentRepository studentRepository;

	@GetMapping(value = "/")
	public String getData() {
		ss.saveData();
		List<Student> students = new ArrayList<>();
		students = (List<Student>) studentRepository.findAll();
		return students.get(0).getName();
	}
}
