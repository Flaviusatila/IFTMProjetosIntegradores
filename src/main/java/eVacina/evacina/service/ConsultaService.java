package eVacina.evacina.service;

import eVacina.evacina.dtos.AgendarRetornoDTO;
import eVacina.evacina.entites.Consulta;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.entites.ProfSaude;
import eVacina.evacina.repository.ConsultaJpaRepository;
import eVacina.evacina.repository.PacienteJpaRepository;
import eVacina.evacina.repository.ProfSaudeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.naming.NotContextException;
import java.util.List;

import static eVacina.evacina.entites.enums.HorarioDisponivel.INDISPONIVEL;

@Service
public class ConsultaService {

    @Autowired
    private ProfSaudeJpaRepository profSaudeJpaRepository;

    @Autowired
    private PacienteJpaRepository pacienteJpaRepository;

    @Autowired
    private ConsultaJpaRepository consultaJpaRepository;

    public Consulta save (Consulta request){
        return consultaJpaRepository.save( request );
    }

    public List<Consulta> findAll(){
        return consultaJpaRepository.findAll();
    }

    @Transactional
    public AgendarRetornoDTO agendarRetorno(AgendarRetornoDTO request) throws Throwable {
        Paciente paciente = pacienteJpaRepository.findByCpf( request.getCpf() )
                            .orElseThrow( () -> new NotContextException("Nao existe Pacientes cadastrados"));

        ProfSaude profSaude = profSaudeJpaRepository.findByUsuario( request.getUsuario() )
                              .orElseThrow( () -> new NotContextException("Nao existe Profissionais da Saude cadastrados"));

//        Object existe = consultaJpaRepository.findByHora( request.getConsulta().getHora())
//                            .orElseThrow( () -> new NotContextException("Cadastro de consulta nao tem horario disponivel"));
//
//        if (existe != HorarioDisponivel.DISPONIVEL){

            Consulta consulta = new Consulta();

            consulta.setHorarioDisponivel( INDISPONIVEL );
            consulta.setHora( request.getConsulta().getHora() );
            consulta.setLocal( request.getConsulta().getLocal() );
            consulta.setProfSaude( profSaude );
            consulta.setPaciente( paciente );

            consultaJpaRepository.save( consulta );

            return request;
//        }
//        throw new NotContextException("Consulta nao tem horario disponivel");
    }
}
