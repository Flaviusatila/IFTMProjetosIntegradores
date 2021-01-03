package eVacina.evacina.service;

import eVacina.evacina.dtos.ListaItemVacinaDTO;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.ItemVacina;
import eVacina.evacina.repository.CartaoVacinaJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CartaoVacinaService {

    @Autowired
    CartaoVacinaJpaRepository repository;

    public List<CartaoVacina> findAll(){
        return repository.findAll();
    }

    @Transactional
    public List<ListaItemVacinaDTO> consultarHistoricoDTOS(Long id){
       Optional<CartaoVacina> cartaoVacina = repository.findById( id );

       ListaItemVacinaDTO listaItemVacinaDTO = new ListaItemVacinaDTO();

       List<ListaItemVacinaDTO> lista = new ArrayList<>();

      List<ItemVacina> itemVacinaList = cartaoVacina.get().getItemVacinas();

      for (ItemVacina itemVacina : itemVacinaList){

          listaItemVacinaDTO.setDataAplicacao(itemVacina.getDataAplicacao());
          listaItemVacinaDTO.setObservacoes( itemVacina.getObservacao() );
          listaItemVacinaDTO.setNome( itemVacina.getVacina().getNome() );
          listaItemVacinaDTO.setDose( itemVacina.getVacina().getDose() );

          lista.add( listaItemVacinaDTO );

      }

     return lista;


    }

}
