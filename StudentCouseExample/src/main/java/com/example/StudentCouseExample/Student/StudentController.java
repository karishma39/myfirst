package com.example.StudentCouseExample.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentDao stdao;

	@GetMapping("/students")
	public List getStudents()
	{
		return stdao.getallstudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentByID( @PathVariable Integer id)
	{
		return stdao.getStudent(id);
	}
	
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student s)
	{
		stdao.addStudent(s);
	}
	@PutMapping("/updatestudent/{id}")
	public void updateStudent(@PathVariable int id, @RequestBody Student s)
	{
		stdao.updateStudent(id, s);
	}
	@DeleteMapping("/removestudent/{id}")
	public void removeStudent(@PathVariable int id)
	{
		stdao.removeStudent(id);;
	}
}
