package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class Backend1Application implements CommandLineRunner {

	public static void main(String[] args)  {
		SpringApplication.run(Backend1Application.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("email1","password1","username1","mobileno1","qualification1",true,"role1"));
		this.userRepository.save(new User("email2","password2","username2","mobileno2","qualification2",false,"role2"));
		//this.userRepository.save(new User());
	}
	 

}
