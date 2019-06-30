package com.springboot.basics.demo.users;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	
	
	@OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	private List<Posts> posts;
	
	
	protected User()
	{
		
	}
	public User(Integer id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	private Date date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public List<Posts> getPosts() {
		return posts;
	}
	public void setPosts(List<Posts> posts) {
		this.posts = posts;
	}
}
