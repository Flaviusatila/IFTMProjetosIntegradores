package com.integrador3.service;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrador3.entity.Projetos;
import com.integrador3.repository.ProjetosRepository;




@Service
@Transactional
public class ProjetosService {

	@Autowired
	private ProjetosRepository repo;
	
	
	public List<Projetos> listAll(){
		return repo.findAll();
	}
	
	public void save(Projetos projetos) {
		repo.save(projetos);
	}
	
	public Projetos get(long cod_projeto) {
		return repo.findById(cod_projeto).get();
	}
	
	public void delete(long cod_projeto) {
		repo.deleteById(cod_projeto);
	}
}
