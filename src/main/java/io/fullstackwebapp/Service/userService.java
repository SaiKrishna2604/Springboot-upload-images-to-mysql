package io.fullstackwebapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.fullstackwebapp.Repository.userRepository;
import io.fullstackwebapp.model.User;

@Service
public class userService {
	@Autowired
	private userRepository userrepository;
	
	public List<User> getAllUsers(){
		return userrepository.findAll();
	}
}
