package com.student.springboot.service;

import java.util.List;

import com.student.springboot.model.Student;

public interface Studentservice {

	Student savestudent(Student std);
	
	boolean deletebystdid(Integer stdid);
	
	List<Student> getall();
	
	Student updatestudent(Integer stdid, Student std);
}
