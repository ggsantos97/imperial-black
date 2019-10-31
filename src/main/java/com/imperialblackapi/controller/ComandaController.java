package com.imperialblackapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.service.ComandaService;



@RestController
@RequestMapping("/comandas")
public class ComandaController {
	
	@Autowired
	private ComandaService service;
	
	/*
	 * public ResponseEntity<Comanda> listarComandas(){ List<Comanda> comandas = new
	 * ArrayList<>(); comandas.addAll(service.listarComandas()); return
	 * ResponseEntity.ok().build(); }
	 */
	@GetMapping
	@ResponseBody
	public String init() {
		return "Olá essa é uma api REST ";
	}
//	@GetMapping
//	@ResponseBody
//	public Iterable<Comanda> listarComandas(){
//		return service.listarComandas();
//	}
	
	@PostMapping
	@ResponseBody
	public Comanda salvar(Comanda c) {
		return service.add(c);
	}

}
