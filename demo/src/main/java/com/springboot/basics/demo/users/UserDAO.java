package com.springboot.basics.demo.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component //or @Repository
public class UserDAO {

	private static List<User> users=new ArrayList<User>();
	
	static
	{
		users.add(new User(1,"abc",new Date(3-9-2000)));
		users.add(new User(2,"def",new Date(2-12-2000)));
		users.add(new User(3,"ghi",new Date(4-2-2000)));
	}
	
	private static int UsersCount=3;
	
	public List<User> findAll()
	{
		return users;
		
	}
	
	public User SaveUser(User user)
	{
		if(user.getId()==null){
			user.setId(++UsersCount);
		}
			
		users.add(user);
		
		return user;	
	}
	
	public User findOne(Integer id)
	{
		for(User u:users)
		{
			if(u.getId().equals(id))
			return u;
		}
		return null;
	}
	
	public User deleteUser(Integer id)
	{
		Iterator it=users.iterator();
		while(it.hasNext())
		{
			User user=(User) it.next();
			if(user.getId()==id){
				it.remove();
			return user;
			}
		}
		return null;
	}
}
