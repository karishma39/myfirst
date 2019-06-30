package com.springboot.basics.demo.students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private List<Students> student= new ArrayList( Arrays.asList(new Students("1","abc"),new Students("2","fgfgf")));

	public List<Students> getAllStudents()
	{
		return student;
	}
	
	public Students getStudent(String id)
	{
		//return student.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		for(Students s: student)
		{
			if(s.getId().equals(id))
				return s;
		}
		
		return null;
	}
	
	public Students getStudentByName(String name)
	{
		for(Students s:student)
		{
			if(s.getName().equals(name))
				return s;
		}
		
		return null;
	}
	
	public void addStudent(Students s)
	{
		student.add(s);
	}

	public void updateStudent(String id, Students s) {
		// TODO Auto-generated method stub
		for(int i=0;i<student.size();i++)
		{
			Students s1=student.get(i);
			if(s1.getId().equals(id))
				student.set(i, s);
			return;
		}
	}

	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		for(Students s:student)
		{
			if(s.getId().equals(id))
		     student.remove(id);
		}
	}
}
