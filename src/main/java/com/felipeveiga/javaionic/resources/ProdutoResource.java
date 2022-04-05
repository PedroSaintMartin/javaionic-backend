package com.felipeveiga.javaionic.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeveiga.javaionic.domain.Produto;
import com.felipeveiga.javaionic.services.ProdutoService;

@RestController
public class ProdutoResource {

	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produtos")
	public List<Produto> findAll(){
		return service.findAll();
	}
	
}
