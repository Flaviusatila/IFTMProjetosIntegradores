package eVacina.evacina.controller;

import eVacina.evacina.entites.Paciente;
import eVacina.evacina.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {


    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<Object> findAll(){
        List<Paciente> list = service.findAll();
        return ResponseEntity.ok().body( list );
    }

    @PostMapping
    public ResponseEntity<Object> save(@RequestBody Paciente request){
        Paciente response = service.save(request);
        return ResponseEntity.ok().body( response );
    }

    @PatchMapping
    public ResponseEntity<Object> atualiza(@RequestBody Paciente request){
        Paciente response = service.save(request);
        return ResponseEntity.ok().body( response );
    }
}
