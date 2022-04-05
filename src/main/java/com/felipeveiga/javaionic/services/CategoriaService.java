package com.felipeveiga.javaionic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeveiga.javaionic.domain.Categoria;
import com.felipeveiga.javaionic.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public List<Categoria> findAll(){
		return repo.findAll();
	}
	
}
