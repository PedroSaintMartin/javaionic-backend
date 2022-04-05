package com.felipeveiga.javaionic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeveiga.javaionic.domain.Categoria;
import com.felipeveiga.javaionic.services.CategoriaService;

@RestController
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	
	@GetMapping("/categorias")
	public List<Categoria> findAll(){
		return service.findAll();
	}
	
}
