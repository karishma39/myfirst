package com.springboot.basics.demo.hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private MessageSource msgsorce;
	
	@GetMapping("/hello")
	public String SayHi()
	{
		return "Hi"; 
	}
	
	@GetMapping("/hello/{name}")
	public HelloMessage SayHiToUser(@PathVariable String name)
	{
		return new HelloMessage(name); 
	}
	
	@GetMapping("/hello-internationalized")
	public String helloworldInternationalized()
	{
		return msgsorce.getMessage("good.morning.message", null, LocaleContextHolder.getLocale()); 
	}

}
