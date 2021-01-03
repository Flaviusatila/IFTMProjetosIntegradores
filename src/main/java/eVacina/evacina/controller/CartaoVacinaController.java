package eVacina.evacina.controller;

import eVacina.evacina.dtos.ListaItemVacinaDTO;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.service.CartaoVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/vacinas/{id}")
    public ResponseEntity<List<ListaItemVacinaDTO>> consultarHistorico(@PathVariable Long id){
        List<ListaItemVacinaDTO> list = service.consultarHistoricoDTOS(id);
        return ResponseEntity.ok().body( list );
    }

}
