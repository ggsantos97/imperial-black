package com.imperialblackapi.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.imperialblackapi.dto.UserDto;
import com.imperialblackapi.repository.UserRepository;

@Service
public class JwtUserDetailsService implements UserDetailsService {
	@Autowired
	private UserRepository repository;

	@Autowired
	private PasswordEncoder bcryptEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		com.imperialblackapi.model.User user = repository.findByEmail(username);
		
		if(user == null) {
			throw new UsernameNotFoundException("Conta não encontrada pra o nome:" + username);
		}
		
			return new User(user.getEmail(),  user.getSenha(),
					new ArrayList<>());
	}
	
	public com.imperialblackapi.model.User save (UserDto dto) {
		com.imperialblackapi.model.User newUser = new  com.imperialblackapi.model.User();
		newUser.setEmail(dto.getUsername());
		newUser.setSenha(bcryptEncoder.encode(dto.getPassword()));
		return repository.save(newUser);
	}
}
