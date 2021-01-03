package eVacina.evacina.service;

import eVacina.evacina.entites.Consulta;
import eVacina.evacina.repository.ConsultaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaService {

    @Autowired
    ConsultaJpaRepository repository;

    public Consulta save (Consulta request){
        return repository.save( request );
    }

    public List<Consulta> findAll(){
        return repository.findAll();
    }
}
