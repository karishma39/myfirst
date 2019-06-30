package com.springboot.basics.demo.users;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Posts {

	@Id
	@GeneratedValue
	private int id;
	private String desc;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.LAZY)
	private User user;
	
	
	
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Posts(int id, String desc) {
		super();
		this.id = id;
		this.desc = desc;
	}




	@Override
	public String toString() {
		return "Posts [id=" + id + ", desc=" + desc + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
