package com.imperialblackapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.model.Produto;
import com.imperialblackapi.repository.ComandaRepository;

@Service
public class ComandaService {
	
	@Autowired
	private ComandaRepository repository;
	
	
//	public Iterable<Comanda> listarComandas(){
//	return repository.findAll();	
//	}
	
	public Comanda add(Comanda c) {
		
		c.getProdutos();
		return repository.save(c);
	}
	
	
	public Iterable<Comanda> findAll(){
		return repository.findAll();
	}
}
