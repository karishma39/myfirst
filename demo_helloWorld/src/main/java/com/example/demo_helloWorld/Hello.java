package com.example.demo_helloWorld;

public class Hello {

	private int id;
	private String content;
	public Hello(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", content=" + content + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
