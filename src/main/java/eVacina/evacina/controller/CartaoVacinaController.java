package eVacina.evacina.controller;

import eVacina.evacina.dtos.CadastrarDadosCartaoVacinaDTO;
import eVacina.evacina.dtos.ListaItemVacinaDTO;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.service.CartaoVacinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.NotContextException;
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

    @PostMapping("/cadastrar")
    public ResponseEntity<CadastrarDadosCartaoVacinaDTO> cadastrarDadosCartaoVacina(@RequestBody CadastrarDadosCartaoVacinaDTO dto) throws NotContextException {
        CadastrarDadosCartaoVacinaDTO response = service.cadastrarDadosCartaoVacina(dto);
        return ResponseEntity.ok().body( response );
    }

}
