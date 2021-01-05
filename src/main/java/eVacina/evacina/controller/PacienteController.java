package eVacina.evacina.controller;

import eVacina.evacina.dtos.AtualizaPacienteDTO;
import eVacina.evacina.dtos.CadastrarPacienteDTO;
import eVacina.evacina.dtos.ConsultarPacientesCadastradosDTO;
import eVacina.evacina.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping(value = "/paciente")
public class PacienteController {


    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<List<ConsultarPacientesCadastradosDTO>> consultarPacientesCadastrados(){
        List<ConsultarPacientesCadastradosDTO> list = service.findAll();
        return ResponseEntity.ok().body( list );
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<CadastrarPacienteDTO> savePaciente(@RequestBody @Valid CadastrarPacienteDTO request) throws Exception {
        CadastrarPacienteDTO response = service.savePaciente(request);
        return ResponseEntity.ok().body( response );
    }

    @PatchMapping
    public ResponseEntity<AtualizaPacienteDTO> atualizaPaciente(@RequestBody @Valid AtualizaPacienteDTO request) {
        AtualizaPacienteDTO response = service.atualiza( request );
        return ResponseEntity.ok().body( response );
    }
}
