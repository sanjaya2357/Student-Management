package com.student.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.springboot.model.Student;
import com.student.springboot.service.Studentservice;

@CrossOrigin
@RestController

@RequestMapping("/student")
public class Studentcontroller {

	@Autowired
	private Studentservice stdservice;
	
	@PutMapping("save")
	public ResponseEntity<Student> savestudent(@RequestBody Student std){
		
		Student st=stdservice.savestudent(std);
		if(st!=null) {
			return ResponseEntity.status(200).body(std);
		}
		return ResponseEntity.status(400).body(null);
	}
	
	@DeleteMapping("delete/{stdid}")
	public ResponseEntity<String> deletestudent(@PathVariable("stdid") Integer stdid){
		
		boolean st=stdservice.deletebystdid(stdid);
		if(stdid!=null) {
			return ResponseEntity.status(200).body("Delete Success");
		}
		return ResponseEntity.status(400).body("Deletefailed");
		
	}
	@GetMapping("/getallstudents")
	public ResponseEntity<List<Student>> getallstudents(){
		
		List<Student> st=stdservice.getall();
		if(st!=null) {
			return ResponseEntity.ok(st);
		}
		return ResponseEntity.status(400).body(null);
		
	}
	@PutMapping("update/{stdid}")
	public ResponseEntity<Student> updatestudent(@PathVariable("stdid") Integer stdid,@RequestBody Student student){
		Student std=stdservice.updatestudent(stdid, student);
		if(std!=null) {
			return ResponseEntity.status(200).body(student);
		}
		return ResponseEntity.status(400).body(null);
		
	}
	
}
