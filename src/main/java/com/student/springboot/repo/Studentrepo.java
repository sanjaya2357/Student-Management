package com.student.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.springboot.model.Student;

@Repository
public interface Studentrepo extends JpaRepository<Student,Integer> {

}
