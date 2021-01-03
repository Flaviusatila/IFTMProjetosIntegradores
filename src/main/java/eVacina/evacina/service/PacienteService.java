package eVacina.evacina.service;

import eVacina.evacina.dtos.CadastrarPacienteDTO;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.Endereco;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.entites.Telefone;
import eVacina.evacina.entites.enums.TipoTelefone;
import eVacina.evacina.repository.CartaoVacinaJpaRepository;
import eVacina.evacina.repository.PacienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {


    @Autowired
    PacienteJpaRepository pacienteJpaRepository;

    @Autowired
    CartaoVacinaJpaRepository cartaoVacinaJpaRepository;

    public List<Paciente> findAll(){
        return pacienteJpaRepository.findAll();
    }

    public Paciente atualiza(Paciente request){
        return pacienteJpaRepository.save( request );
    }

    public CadastrarPacienteDTO savePaciente(CadastrarPacienteDTO request) throws Exception {
        long ja_existe_cpf_cadastrado = pacienteJpaRepository.countByCpf( request.getCpf() );

        if (ja_existe_cpf_cadastrado == 0) {

            request.setDataCastro( new Date() );

            Paciente paciente = new Paciente();
            CartaoVacina vacina = new CartaoVacina();
            Telefone telefone = new Telefone();
            Endereco endereco = new Endereco();

            paciente.setApelido( request.getApelido() );
            paciente.setCpf( request.getCpf() );
            paciente.setNome( request.getNome() );
            paciente.setDataCastro( new Date() );

            endereco.setRua( request.getTelefone().getEndereco().getRua() );
            endereco.setCidade( request.getTelefone().getEndereco().getCidade() );
            endereco.setEstado( request.getTelefone().getEndereco().getEstado() );
            endereco.setBairro( request.getTelefone().getEndereco().getBairro() );

            telefone.setNumero( request.getTelefone().getNumero() );
            telefone.setTipo( request.getTelefone().getTipo() );
            telefone.setEndereco( endereco );

            vacina.setCod( request.getCpf() );
            vacina.setTelefone( telefone );

            cartaoVacinaJpaRepository.save( vacina );
            pacienteJpaRepository.save( paciente );


            return request;
        }
        throw new Exception( "Ja Existe cpf Cadastrado" );
    }

}
