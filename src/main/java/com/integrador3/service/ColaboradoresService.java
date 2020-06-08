package com.integrador3.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.integrador3.entity.Colaboradores;
import com.integrador3.repository.ColaboradoresRepository;


@Service
@Transactional
public class ColaboradoresService {

		@Autowired
		private ColaboradoresRepository repo;
		
		public List<Colaboradores> listAll(){
			return repo.findAll();
		}
		
		public void save(Colaboradores colaboradores) {
			repo.save(colaboradores);
		}
		
		public Colaboradores get(long cadastro_gestor) {
			return repo.findById(cadastro_gestor).get();
		}
		
		public void delete(long cadastro_gestor) {
			repo.deleteById(cadastro_gestor);
		}
		
}
