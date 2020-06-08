package com.integrador3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrador3.entity.Trabalha;
import com.integrador3.repository.TrabalhaRepository;

@Service
@Transactional
public class TrabalhaService {

	@Autowired
	private TrabalhaRepository repo;
	
	public List<Trabalha> listAll(){
		return repo.findAll();
	}
	
	public void save(Trabalha trabalha) {
		repo.save(trabalha);
	}
	
	public Trabalha get(long cod_env) {
		return repo.findById(cod_env).get();
	}
	
	public void delete(long cod_env) {
		repo.deleteById(cod_env);
	}
}
