package eVacina.evacina.service;

import eVacina.evacina.entites.Consulta;
import eVacina.evacina.repository.ConsultaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ConsultaService {

    @Autowired
    ConsultaJpaRepository repository;

    public Consulta save (Consulta request){
        return repository.save( request );
    }
}
