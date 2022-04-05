package com.felipeveiga.javaionic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipeveiga.javaionic.domain.Cidade;
import com.felipeveiga.javaionic.repository.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findAll(){
		return repo.findAll();
	}
	
}
