package com.springboot.basics.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); //run is a static method and SpringApp is a static class
	}
	
	@Bean
	public LocaleResolver localeresolver()
	{
		AcceptHeaderLocaleResolver localeresolver=new AcceptHeaderLocaleResolver();
		localeresolver.setDefaultLocale(Locale.US);
		return localeresolver;
	}
	
	// OR just write zpring.message.basename=messages and then you don't you to create the below bean
	@Bean
	public ResourceBundleMessageSource messageSource()
	{
		ResourceBundleMessageSource messagesource=new ResourceBundleMessageSource();
		messagesource.setBasenames("messages");
		return messagesource;
	}

}

