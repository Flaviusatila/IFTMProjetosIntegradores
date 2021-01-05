package eVacina.evacina.controller;

import eVacina.evacina.dtos.AgendarRetornoDTO;
import eVacina.evacina.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
