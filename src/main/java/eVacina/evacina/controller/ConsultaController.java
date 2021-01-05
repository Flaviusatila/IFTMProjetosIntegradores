package eVacina.evacina.controller;

import eVacina.evacina.dtos.AgendarRetornoDTO;
import eVacina.evacina.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService service;


//    @GetMapping
//    public ResponseEntity<Object> findAll(){
//        List<Consulta> list = service.findAll();
//        return ResponseEntity.ok().body( list );
//    }


//    @PostMapping("/procedimentos")
//    public ResponseEntity<Object> procedimentosRealizados(@RequestBody Consulta request){
//        Consulta response = service.save(request);
//        return ResponseEntity.ok().body( response );
//    }

    @PostMapping("/agendar_retorno")
    public ResponseEntity<AgendarRetornoDTO> agendarRetorno(@RequestBody AgendarRetornoDTO request) throws Throwable {
        AgendarRetornoDTO response = service.agendarRetorno(request);
        return ResponseEntity.ok().body( response );
    }

//    @PatchMapping
//    public ResponseEntity<Object> descreverObservacao(@RequestBody Consulta request){
//        Consulta response = service.save(request);
//        return ResponseEntity.ok().body( response );
//    }
}
