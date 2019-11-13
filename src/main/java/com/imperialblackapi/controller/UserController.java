package com.imperialblackapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.User;
import com.imperialblackapi.service.UserService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	private List<User> users = createList();
	
	@GetMapping
	public User validarLogin() {
		return  new User("Usuário autenticado com sucesso");
	}

	public ResponseEntity<User> cadastrarUser(@RequestBody User user ){
		
		return null;
	}
	
	private static List<User> createList() {
		List<User> tempUsers = new ArrayList<>();
		User emp1 = new User();
		emp1.setEmail("ggsantos.bsb@gmail.com");
		
		return tempUsers;
	}
}
