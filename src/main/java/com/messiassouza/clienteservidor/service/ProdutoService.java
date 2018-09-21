package com.messiassouza.clienteservidor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.messiassouza.clienteservidor.domain.Produto;
import com.messiassouza.clienteservidor.repository.ProdutoRepository;
import com.messiassouza.clienteservidor.service.exception.ObjectNotFoundException;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repo; 
	
	public Produto update(Produto obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	
	public Produto find(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id: " + id + ", Tipo: " + Produto.class.getName()));
	}
	
	public List<Produto> findAll(){
		return repo.findAll();
	}

}
