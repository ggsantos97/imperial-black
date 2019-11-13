package com.imperialblackapi.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imperialblackapi.model.Comanda;
import com.imperialblackapi.service.ComandaService;



@RestController
@CrossOrigin
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
	public Iterable<Comanda> findAll() {
		return service.findAll();

	}

	
	@PostMapping
	@ResponseBody
	public Comanda salvar(@RequestBody Comanda c) {
		return service.add(c);
	}
	
	@DeleteMapping(value = "/{id}")
	public String excluir(@PathVariable (name= "id") Long id)  {
		 service.delete(id);
		 return "Comanda Deletada com sucesso !!!";
	}

}
