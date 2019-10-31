package com.imperialblackapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.service.ComandaService;



@RestController
public class ComandaController {
	
	@Autowired
	private ComandaService service;
	
	/*
	 * public ResponseEntity<Comanda> listarComandas(){ List<Comanda> comandas = new
	 * ArrayList<>(); comandas.addAll(service.listarComandas()); return
	 * ResponseEntity.ok().build(); }
	 */
	
//	@GetMapping
//	@ResponseBody
//	public Iterable<Comanda> listarComandas(){
//		return service.listarComandas();
//	}

}
