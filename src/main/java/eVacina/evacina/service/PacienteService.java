package eVacina.evacina.service;

import eVacina.evacina.entites.Paciente;
import eVacina.evacina.repository.PacienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {


    @Autowired
    PacienteJpaRepository repository;

    public List<Paciente> findAll(){
        return repository.findAll();
    }

    public Paciente save(Paciente request){
        return repository.save( request );
    }

}
