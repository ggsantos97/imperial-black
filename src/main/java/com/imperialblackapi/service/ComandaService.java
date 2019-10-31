package com.imperialblackapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.repository.ComandaRepository;

@Service
public class ComandaService {
	
	@Autowired
	private ComandaRepository repository;
//	public Iterable<Comanda> listarComandas(){
//	return repository.findAll();	
//	}
	
	public Comanda add(Comanda c) {
		return repository.save(c);
	}

}
