package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
public class UserController {
  @Autowired
  private UserRepository userRepository;
  
  @GetMapping("users")
  public List<User> getUsers(){
	  return this.userRepository.findAll();
	  
  }
  
  
  @PostMapping("signup")
  public boolean getUser(@RequestBody User user)
  {
	  String email=user.getEmail();
	  int size=(userRepository.findByEmail(email)).size();
	  if(size==0)
	  {
	  this.userRepository.save(user);
	  return true;
	  }
	  return false;
	  
  }
  
}
