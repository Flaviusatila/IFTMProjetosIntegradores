package eVacina.evacina.service;

import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.repository.CartaoVacinaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CartaoVacinaService {

    @Autowired
    CartaoVacinaJpaRepository repository;

    public List<CartaoVacina> findAll(){
        return repository.findAll();
    }

}
