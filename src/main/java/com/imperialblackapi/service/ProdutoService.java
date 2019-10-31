package com.imperialblackapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imperialblackapi.model.Produto;
import com.imperialblackapi.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public Produto add(Produto p) {
	return repository.save(p);	
	}

}
