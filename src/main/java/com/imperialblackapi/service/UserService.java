package com.imperialblackapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialblackapi.dto.LoginDto;
import com.imperialblackapi.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	

	
}
