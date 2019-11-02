package com.imperialblackapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.Produto;
import com.imperialblackapi.service.ProdutoService;

@RestController
@RequestMapping("/produto")

public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Produto> salvar(@RequestBody Produto p) {
				return ResponseEntity.ok(service.add(p));
	}
	
	@GetMapping
	public Iterable<Produto> findAll() {
		return service.findAll();
	}
	
}
