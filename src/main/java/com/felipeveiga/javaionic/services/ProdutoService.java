package com.felipeveiga.javaionic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeveiga.javaionic.domain.Produto;
import com.felipeveiga.javaionic.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;
	
	public List<Produto> findAll(){
		return repo.findAll();
	}
	
}
