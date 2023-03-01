package com.student.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	int stdid;
	String name;
	String branch;
	String collegename;
	double percentage;
	
	public Student() {
		
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", name=" + name + ", branch=" + branch + ", collegename=" + collegename
				+ ", percentage=" + percentage + "]";
	}

	public Student(int stdid, String name, String branch, String collegename, double percentage) {
		super();
		this.stdid = stdid;
		this.name = name;
		this.branch = branch;
		this.collegename = collegename;
		this.percentage = percentage;
	}
	
	
	

}
