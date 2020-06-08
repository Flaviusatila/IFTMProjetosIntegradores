package com.integrador3.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.integrador3.entity.Gestores;
import com.integrador3.repository.GestoresRepository;

@Service
@Transactional
public class GestoresService {

		@Autowired
		private GestoresRepository repo;
		
		public List<Gestores> listAll(){
			return repo.findAll();
		}
		
		public void save(Gestores gestores) {
			repo.save(gestores);
		}
		
		public Gestores get(long cadastro_gestor) {
			return repo.findById(cadastro_gestor).get();
		}
		
		public void delete(long cadastro_gestor) {
			repo.deleteById(cadastro_gestor);
		}
}
