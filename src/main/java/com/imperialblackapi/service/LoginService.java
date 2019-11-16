//package com.imperialblackapi.service;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.imperialblackapi.dto.LoginDto;
//import com.imperialblackapi.exception.ExpiredtokenExpection;
//import com.imperialblackapi.exception.InvalidTokenException;
//import com.imperialblackapi.model.User;
//import com.imperialblackapi.repository.UserRepository;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//
//@Service
//public class LoginService {
//
//	private final UserRepository repository;
//	private final TokenService tokenService;
//
//	
//	@Autowired
//	public LoginService(UserRepository userRepository, TokenService tokenService) {
//		this.repository = userRepository;
//		this.tokenService = tokenService;
//	}
//	
//	public User autenticar(LoginDto logindto, String token) {
//		User user = repository.findByEmail(logindto.getEmail());
//		if(logindto.getSenha().equals(user.getSenha()) && !token.isEmpty() && validate(token) ) {
//			String tokenGerado = tokenService.generateToken(user);
//			user.setToken(tokenGerado);
//			return user;
//		}
//		else {
//			throw new InvalidTokenException();
//		}
//	}
//
//	private boolean validate(String token) {
//		
//		try {
//			String tokenTratado = token.replace( "Bearer", "");
//			Claims claims = tokenService.decodeToken(tokenTratado);
//			
//			// verifica se o token está expirado
//			if (claims.getExpiration().before(new Date(System.currentTimeMillis()))) throw new ExpiredtokenExpection();
//			System.out.println(claims.getExpiration());
//			return true;
//		} catch (ExpiredtokenExpection et) {
//			et.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		throw new InvalidTokenException();
//	}
//
//
//}

