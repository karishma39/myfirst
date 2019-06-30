package com.springboot.basics.demo.students;

public class Students {
	
	private String id;
	private String name;
	
	public Students()
	{
		
	}
	public Students(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
