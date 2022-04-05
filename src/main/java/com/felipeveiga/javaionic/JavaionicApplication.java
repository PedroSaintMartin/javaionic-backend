package com.felipeveiga.javaionic;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.felipeveiga.javaionic.domain.Categoria;
import com.felipeveiga.javaionic.domain.Cidade;
import com.felipeveiga.javaionic.domain.Estado;
import com.felipeveiga.javaionic.domain.Produto;
import com.felipeveiga.javaionic.repository.CategoriaRepository;
import com.felipeveiga.javaionic.repository.CidadeRepository;
import com.felipeveiga.javaionic.repository.EstadoRepository;
import com.felipeveiga.javaionic.repository.ProdutoRepository;

@SpringBootApplication
public class JavaionicApplication implements CommandLineRunner{


	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JavaionicApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Eletrônicos");
		Categoria cat2 = new Categoria(null, "Limpeza");

		Produto p1 = new Produto(null, "Computador", 3000.0);
		Produto p2 = new Produto(null, "Impressora", 300.0);
		Produto p3 = new Produto(null, "Máquina de lavar", 1500.00);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2));
		cat2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado est1 = new Estado(null, "São paulo");
		Estado est2 = new Estado(null, "Rio de Janeiro");
		
		Cidade cid1 = new Cidade(null, "Niterói", est2);
		Cidade cid2 = new Cidade(null, "Santos", est1);
		Cidade cid3 = new Cidade(null, "Macaé", est1);
		
		est1.getCidades().addAll(Arrays.asList(cid2));
		est2.getCidades().addAll(Arrays.asList(cid1, cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
	}

}
