package com.jagdeep.model;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.stereotype.Component;

@RedisHash("Student")
@Component
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	public enum Gender {
		MALE, FEMALE
	}

	private String id;
	private String name;
	private Gender gender;
	private int grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Student(String name, Gender gender, int grade) {
		super();
		this.name = name;
		this.gender = gender;
		this.grade = grade;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

}