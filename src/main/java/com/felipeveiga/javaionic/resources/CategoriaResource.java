package com.felipeveiga.javaionic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeveiga.javaionic.domain.Cidade;
import com.felipeveiga.javaionic.services.CidadeService;

@RestController
public class CategoriaResource {

	@Autowired
	private CidadeService service;
	
	@GetMapping("/cidades")
	public ResponseEntity<List<Cidade>> findAll(){
		List<Cidade> cidades = service.findAll();
		return ResponseEntity.ok().body(cidades);
	}
	
}
