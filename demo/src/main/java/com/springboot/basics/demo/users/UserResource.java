package com.springboot.basics.demo.users;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {
	
	@Autowired
	private UserDAO userservice;

	@GetMapping("/users")
	public List<User> retrieveUsers()
	{
		return userservice.findAll();
		
	}
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) throws UserNotFoundException
	{
		User user=userservice.findOne(id);
		if(user==null)
			throw new UserNotFoundException("id- "+id);
		
		//retrieve all users link
 		
		return userservice.findOne(id);
		
	}
	@PostMapping("/users")
	public void createuser(@RequestBody User user)
	{
		User saveduser=userservice.SaveUser(user);
		
		
	}
	
	@DeleteMapping("/users/{id}")
	public void  deleteUser(@PathVariable int id) throws UserNotFoundException
	{
	
	User user=userservice.deleteUser(id);
	if(user==null)
		throw new UserNotFoundException("id- "+id);
	
	}
}
