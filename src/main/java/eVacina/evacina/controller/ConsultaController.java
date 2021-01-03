package eVacina.evacina.controller;

import eVacina.evacina.entites.Consulta;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService service;


    @GetMapping
    public ResponseEntity<Object> findAll(){
        List<Consulta> list = service.findAll();
        return ResponseEntity.ok().body( list );
    }


    @PostMapping("/procedimentos")
    public ResponseEntity<Object> procedimentosRealizados(@RequestBody Consulta request){
        Consulta response = service.save(request);
        return ResponseEntity.ok().body( response );
    }

    @PostMapping
    public ResponseEntity<Object> agendarRetorno(@RequestBody Consulta request){
        Consulta response = service.save(request);
        return ResponseEntity.ok().body( response );
    }

    @PatchMapping
    public ResponseEntity<Object> descreverObservacao(@RequestBody Consulta request){
        Consulta response = service.save(request);
        return ResponseEntity.ok().body( response );
    }
}
