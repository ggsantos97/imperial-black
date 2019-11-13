package com.imperialblackapi.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.imperialblackapi.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class TokenService {
 private static final long expirationTime = 1800000;
 private  String key = "@Imperial-Black-Hookah713Sul@Secret";
 
		public String generateToken(User user) {
			return Jwts.builder()
					.setIssuedAt(new Date(System.currentTimeMillis()))
					.setSubject("Teste Jwt Api")
					.setExpiration(new Date(System.currentTimeMillis() + expirationTime))
					.signWith(SignatureAlgorithm.HS256, key )
					.compact();
		}

		public Claims decodeToken(String token) {

			return Jwts.parser()
					.setSigningKey(key)
					.parseClaimsJws(token)
					.getBody();
		}
}
