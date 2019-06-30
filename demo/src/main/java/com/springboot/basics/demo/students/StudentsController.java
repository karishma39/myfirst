package com.springboot.basics.demo.students;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {
	
	@Autowired
	StudentService studentservice;

	@RequestMapping("/students")
	public List<Students> GetAllStudents()
	{
		return studentservice.getAllStudents();
	}
	
	@RequestMapping("/students/{id}") //{id} is a variable portion
	public Students getStudent(@PathVariable String id) //@pathvariable annotation tells spring that this is the variable in the path(id)
	{
		return studentservice.getStudent(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/students")
	//@PostMapping
	public void AddStudent(@RequestBody Students s) //@ReqBody tells spring MVC that your request is going to contain a JSON rep of Student instance and pass it to addStudent when URL is mapped 
	{
		studentservice.addStudent(s);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/students/{id}")
	public void UpdateStudent(@RequestBody Students s, @PathVariable String id) //@ReqBody tells spring MVC that your request is going to contain a JSON rep of Student instance and pass it to addStudent when URL is mapped 
	{
		studentservice.updateStudent(id,s);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/students/{id}")
	public void DeleteStudent(@PathVariable String id) //@ReqBody tells spring MVC that your request is going to contain a JSON rep of Student instance and pass it to addStudent when URL is mapped 
	{
		studentservice.deleteStudent(id);
	}
	/*@RequestMapping("/students/{name}")
	public Students getStudentByname(@PathVariable String name)
	{
		return studentservice.getStudentByName(name);
	}
	
	/*public String getStudentName(@PathVariable String id) //@pathvariable annotation tells spring that this is the variable in the path(id)
	{
		return studentservice.getStudent(id).getName();
		
	}*/
	
	
}
