package com.springboot.basics.demo.users;

import java.util.List;
import java.util.Optional;

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
public class UserJPAResource {
	
	@Autowired
	private UserRepository userepsitory;
	@Autowired
	private PostRepository postrepsitory;
	
	@Autowired
	// private UserDAO userservice; dont need it anymore

	@GetMapping("jpa/users")
	public List<User> retrieveUsers()
	{
		return userepsitory.findAll();
		
	}
	@GetMapping("jpa/users/{id}")
	public Optional<User> retrieveUser(@PathVariable int id) throws UserNotFoundException
	{
		Optional<User> user=userepsitory.findById(id);
		
		if(!user.isPresent())
			throw new UserNotFoundException("id- "+id);
		
		//retrieve all users link
 		
		return user;
		
	}
	@PostMapping("jpa/users")
	public void createuser(@RequestBody User user)
	{
		User saveduser=userepsitory.saveAndFlush(user);
		
		
	}
	
	@DeleteMapping("jpa/users/{id}")
	public void  deleteUser(@PathVariable int id) throws UserNotFoundException
	{
	
	userepsitory.deleteById(id);;
	
	}
	
	@GetMapping("jpa/users/{id}/posts")
	public List<Posts> retrieveallpostsbyUser(@PathVariable int id) throws UserNotFoundException
	{
		Optional<User> user=userepsitory.findById(id);
		if(!user.isPresent())
			throw new UserNotFoundException("id- "+id);
		
		return user.get().getPosts();
	}
	
	@PostMapping("jpa/users/{id}/posts")
	public void createpostforuser(@PathVariable int id, @RequestBody Posts post) throws UserNotFoundException
	{
		Optional<User> user=userepsitory.findById(id);
		if(!user.isPresent())
			throw new UserNotFoundException("id- "+id);
		
		User user1=user.get();
		
		post.setUser(user1);
		
		postrepsitory.saveAndFlush(post);
		
	}
	
}
