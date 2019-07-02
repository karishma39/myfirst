package com.example.demo_helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	/*@GetMapping("/greeting")
	public Hello getGreeting()
	{
		return new Hello(1, "Hello World");
	}*/
	
	@GetMapping("/greeting/{name}")
	public Hello getGreetingbyname(@PathVariable String name)
	{
	
		return new Hello(1, "Hello "+name);
	}
	
	
	@GetMapping("/greeting")
	public Hello getGreetingbyname2(@RequestParam(value="name", defaultValue = "World") String name)
	{
	
		return new Hello(1, "Hello "+name);
	}

}
