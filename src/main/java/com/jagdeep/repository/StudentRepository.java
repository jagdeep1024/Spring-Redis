package com.jagdeep.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jagdeep.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}