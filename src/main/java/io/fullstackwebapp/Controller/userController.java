package io.fullstackwebapp.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.fullstackwebapp.Service.userService;
import io.fullstackwebapp.model.User;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class userController {
	@Autowired
	private userService userservice;
	
	@GetMapping(value="/users" , produces=MediaType.APPLICATION_JSON_VALUE)
	public List<User> getAllusers(){
		return userservice.getAllUsers();
	}
}
