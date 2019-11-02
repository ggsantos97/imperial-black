package com.imperialblackapi.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.imperialblackapi.model.Produto;
import com.imperialblackapi.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Transactional
	public Produto add(Produto p) {
	return repository.save(p);	
	}

	
	public Iterable<Produto> findAll() {
		return  repository.findAll();
	}
}
