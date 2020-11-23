package io.fullstackwebapp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.fullstackwebapp.Repository.userRepository;
import io.fullstackwebapp.model.User;

@SpringBootApplication
@CrossOrigin(origins ="*")

public class FullStackWebAppApplication {
	@Autowired
	private userRepository repo;
	@PostConstruct
	public void insert() {
		User user= new User();
		user.setUserId(100);
		user.setUserName("Doctor Strange");
		user.setCity("New York");
		user.setMobile("9160834563");
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formatted = current.format(formatter);
        user.setCreatedDate(current);
		user.setPicpath("https://static.onecms.io/wp-content/uploads/sites/6/2016/10/dr-strange.jpg");
		repo.save(user);
		System.out.println("Values-added");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(FullStackWebAppApplication.class, args);
	}
	
	

}
