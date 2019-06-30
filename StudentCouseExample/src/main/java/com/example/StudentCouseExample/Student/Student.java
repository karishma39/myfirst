package com.example.StudentCouseExample.Student;

import java.util.List;

public class Student {
	
	private int sid;
	private String name;
	private List<String> courses;
	
	public Student()
	{
		
	}
	
	public Student(int sid, String name, List<String> courses) {
		super();
		this.sid = sid;
		this.name = name;
		this.courses = courses;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}
	public List getCourses() {
		return courses;
	}
	
	
	

}
