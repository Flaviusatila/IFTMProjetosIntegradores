package eVacina.evacina.service;

import eVacina.evacina.dtos.CadastrarDadosCartaoVacinaDTO;
import eVacina.evacina.dtos.ListaItemVacinaDTO;
import eVacina.evacina.entites.*;
import eVacina.evacina.repository.CartaoVacinaJpaRepository;
import eVacina.evacina.repository.ConsultaJpaRepository;
import eVacina.evacina.repository.PacienteJpaRepository;
import eVacina.evacina.repository.ProfSaudeJpaRepository;
import eVacina.evacina.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CartaoVacinaService {
    @Autowired
    private ProfSaudeJpaRepository profSaudeJpaRepository;

    @Autowired
    private PacienteJpaRepository pacienteJpaRepository;

    @Autowired
    private ConsultaJpaRepository consultaJpaRepository;

    @Autowired
    private CartaoVacinaJpaRepository cartaoVacinaJpaRepository;

    public List<CartaoVacina> findAll() {
        return cartaoVacinaJpaRepository.findAll();
    }

    @Transactional
    public List<ListaItemVacinaDTO> consultarHistoricoDTOS(Long id) {
        Optional<CartaoVacina> cartaoVacina = cartaoVacinaJpaRepository.findById( id );

        ListaItemVacinaDTO listaItemVacinaDTO = new ListaItemVacinaDTO();

        List<ListaItemVacinaDTO> lista = new ArrayList<>();

        List<ItemVacina> itemVacinaList = cartaoVacina.get().getItemVacinas();

        for (ItemVacina itemVacina : itemVacinaList) {

            listaItemVacinaDTO.setDataAplicacao( itemVacina.getDataAplicacao() );
            listaItemVacinaDTO.setObservacoes( itemVacina.getObservacao() );
            listaItemVacinaDTO.setNome( itemVacina.getVacina().getNome() );
            listaItemVacinaDTO.setDose( itemVacina.getVacina().getDose() );

            lista.add( listaItemVacinaDTO );

        }

        return lista;


    }

    @Transactional
    public CadastrarDadosCartaoVacinaDTO cadastrarDadosCartaoVacina(CadastrarDadosCartaoVacinaDTO dto) {

        Paciente paciente = pacienteJpaRepository.findByCpf( dto.getCpf() )
                .orElseThrow( () -> new ResourceNotFoundException( "Nao existe Pacientes cadastrados" ) );

        ProfSaude profSaude = profSaudeJpaRepository.findByUsuario( dto.getUsuario() )
                .orElseThrow( () -> new ResourceNotFoundException( "Nao existe Profissionais da Saude cadastrados" ) );

        CartaoVacina cartaoVacina = cartaoVacinaJpaRepository.findByCod( dto.getCpf() )
                .orElseThrow( () -> new ResourceNotFoundException( "Nao existe Cartao de Vacina cadastrados" ) );

        Vacina vacina = new Vacina();
        vacina.setNome( dto.getNome() );
        vacina.setDose( dto.getDose() );
        vacina.setLote( dto.getLote() );
        vacina.setObservacao( dto.getObservacoesVacina() );

        ItemVacina itemVacina = new ItemVacina();
        itemVacina.setObservacao( dto.getProcedimentos() );
        itemVacina.setDataAplicacao( new Date() );
        itemVacina.setVacina( vacina );

        List<ItemVacina> list = new ArrayList<>();

        list.add( itemVacina );
        cartaoVacina.setItemVacinas( list );

        Consulta consulta = new Consulta();
        consulta.setCartaoVacinaConsulta( cartaoVacina );
        consulta.setPaciente( paciente );
        consulta.setProfSaude( profSaude );
        consulta.setHora( dto.getConsulta().getHora() );
        consulta.setLocal( dto.getConsulta().getLocal() );

        cartaoVacinaJpaRepository.save( cartaoVacina );
        consultaJpaRepository.save( consulta );

        return dto;
    }
}
