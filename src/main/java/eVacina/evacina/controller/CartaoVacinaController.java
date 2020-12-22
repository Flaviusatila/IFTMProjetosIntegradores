package eVacina.evacina.controller;

import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.service.CartaoVacinaService;
import eVacina.evacina.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/usuario")
public class CartaoVacinaController {


    @Autowired
    private CartaoVacinaService service;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        List<CartaoVacina> list = service.findAll();
        return ResponseEntity.ok().body( list );
    }

}
