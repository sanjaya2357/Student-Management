package com.student.springboot.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.springboot.model.Student;
import com.student.springboot.repo.Studentrepo;
import com.student.springboot.service.Studentservice;

@Service
public class Studentserviceimpl implements Studentservice {

	@Autowired
	private Studentrepo stdrepo;
	
	@Override
	public Student savestudent(Student std) {
		
		return stdrepo.save(std);
	}

	@Override
	public boolean deletebystdid(Integer stdid) {
		stdrepo.deleteById(stdid);
		return false;
	}

	@Override
	public List<Student> getall() {
		
		return stdrepo.findAll();
	}

	@Override
	public Student updatestudent(Integer stdid,Student std) {
		
		Student student=stdrepo.getById(stdid);
		student.setStdid(std.getStdid());
		student.setName(std.getName());
		student.setBranch(std.getBranch());
		student.setCollegename(std.getCollegename());
		student.setPercentage(std.getPercentage());
		
		Student updatestd=stdrepo.save(student);
           
		return updatestd;
	}

}
