package com.imperialblackapi.dto;

import com.imperialblackapi.model.User;

public class UserAutenticadoDto {
	
	private String tipo;
	private String email;
	private String nome;
	private String token;
	
	public UserAutenticadoDto(String email, String nome, String token, String tipo) {
		this.email = email;
		this.nome = nome;
		this.token = token;
		this.tipo = tipo;
	}
	
	public UserAutenticadoDto() {
	
	}
	
	public static UserAutenticadoDto toDTO(User user, String tipo) {
		return  new UserAutenticadoDto(user.getEmail(), user.getNome(), user.getToken(), user.getTipo());
	}
}
