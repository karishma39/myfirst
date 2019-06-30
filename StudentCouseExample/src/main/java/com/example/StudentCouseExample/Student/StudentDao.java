package com.example.StudentCouseExample.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	
	ArrayList<Student> stu=new ArrayList<Student>(Arrays.asList((new Student(1, "neha", Arrays.asList("maths","science"))),new Student(2, "jay", Arrays.asList("computer","science"))));
	 
	 
	 public List getallstudents()
		{
			return stu;
			
		}
	 
	 public Student getStudent(int id)
	 {
		 for(Student s: stu)
		 {
			 if(s.getSid()==id)
				 return s;
		 }
		 
		 return null;
	 }
	 
	 public void addStudent(Student s)
	 {
		 stu.add(s);
	 }
	 
	 public void updateStudent(int id, Student s)
	 {
		 for(int i=0;i<stu.size();i++)
		 {
			 if(s.getSid()==stu.get(i).getSid())
				 stu.set(i, s);
		 }
	 }
	 
	 public void removeStudent(int id)
	 {
		 for(int i=0;i<stu.size();i++)
		 {
			 if(stu.get(i).getSid()==id)
				 stu.remove(i);
		 }
	 }
	 
	}
	
	
