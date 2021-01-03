package eVacina.evacina.controller;

import eVacina.evacina.dtos.AtualizaPacienteDTO;
import eVacina.evacina.dtos.CadastrarPacienteDTO;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

    @PostMapping("/cadastrar")
    public ResponseEntity<CadastrarPacienteDTO> save(@RequestBody @Validated CadastrarPacienteDTO request) throws Exception {
        CadastrarPacienteDTO response = service.savePaciente(request);
        return ResponseEntity.ok().body( response );
    }

    @PatchMapping
    public ResponseEntity<AtualizaPacienteDTO> atualiza(@RequestBody @Validated AtualizaPacienteDTO request) throws Exception {
        AtualizaPacienteDTO response = service.atualiza(request);
        return ResponseEntity.ok().body( response );
    }
}
