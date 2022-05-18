package com.bnta.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication belongs to the 'autoConfigure' package
//@SpringBootApplication = @Configuration + @EnableAutoConfiguration +@ComponentScan annotations
//allow Spring to automatically find our Beans (any classes with @Bean annotation,
//... or an annotation that inherits from it, such as @Component, @Controller, @Service etc),

//Into the SpringApplication.run static method below, we pass a reference to our main class ("PracticeApplication.java)
//It launches the Springframework when  we run the project
//Also pass along args array to Spring, in case any arguments are provided in terminal when terminal is executed,
//so Spring can handle them

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
