package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userID}")
	public User getUser(@PathVariable("userID") Long userID) {
		
		User user = userService.getUser(userID);
		
		//Contact_Service URl
		//http://localhost:9002/conatct/user/1111
		
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserID(), List.class);
		
		user.setContact(contacts);
		return user;
		
		
		//return this.userService.getUser(userID);
	}

}
