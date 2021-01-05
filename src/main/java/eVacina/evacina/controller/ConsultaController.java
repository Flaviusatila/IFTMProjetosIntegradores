package eVacina.evacina.controller;

import eVacina.evacina.dtos.AgendarRetornoDTO;
import eVacina.evacina.dtos.ConsultaDTO;
import eVacina.evacina.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService service;

    @PostMapping("/agendar_retorno")
    public ResponseEntity<AgendarRetornoDTO> agendarRetorno(@RequestBody @Valid AgendarRetornoDTO request){
        AgendarRetornoDTO response = service.agendarRetorno(request);
        return ResponseEntity.ok().body( response );
    }

    @GetMapping
    public ResponseEntity<Page<ConsultaDTO>> listaTodasAsConsultas(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage", defaultValue = "2") Integer linesPerPage){
        PageRequest pageRequest  = PageRequest.of( page,linesPerPage);
        Page<ConsultaDTO> list = service.findAllPaged(pageRequest);
        return ResponseEntity.ok().body( list );
    }

}
