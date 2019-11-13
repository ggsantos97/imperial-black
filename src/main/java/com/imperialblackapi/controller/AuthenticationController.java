package com.imperialblackapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.imperialblackapi.dto.LoginDto;
import com.imperialblackapi.dto.UserAutenticadoDto;
import com.imperialblackapi.dto.UserDto;
import com.imperialblackapi.model.User;
import com.imperialblackapi.service.LoginService;


public class AuthenticationController {

	@Autowired
	private LoginService sevice;
	
	
	@PostMapping("/login")
	public ResponseEntity<UserAutenticadoDto> autenticar(@RequestBody LoginDto loginDto, @RequestHeader String Authorization){
		User user = sevice.autenticar(loginDto,  Authorization);
		return new ResponseEntity<UserAutenticadoDto>(UserAutenticadoDto.toDTO(user, "Bearer "), HttpStatus.ACCEPTED);
	}
}
