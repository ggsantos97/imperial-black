package com.imperialblackapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.Produto;
import com.imperialblackapi.service.ProdutoService;

@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@PostMapping
	@ResponseBody
	public String salvar(Produto p) {
				service.add(p);
				return"salvo com sucesso";
	}
	
}
