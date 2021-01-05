package eVacina.evacina.config;

import eVacina.evacina.entites.*;
import eVacina.evacina.entites.enums.HorarioDisponivel;
import eVacina.evacina.entites.enums.TipoTelefone;
import eVacina.evacina.repository.CartaoVacinaJpaRepository;
import eVacina.evacina.repository.ConsultaJpaRepository;
import eVacina.evacina.repository.ItemVacinaJpaRepository;
import eVacina.evacina.repository.ProfSaudeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.LocalDateTime;
import java.util.Date;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

    @Autowired
    private CartaoVacinaJpaRepository cartaoVacinaJpaRepository;

    @Autowired
    private ItemVacinaJpaRepository itemVacinaJpaRepository;

    @Autowired
    private ConsultaJpaRepository consultaJpaRepository;

    @Autowired
    private ProfSaudeJpaRepository profSaudeJpaRepository;

    private static final Date date = new Date( 2020, 22, 11 );

    @Override
    public void run(String... args) {


        CartaoVacina cartaoVacina = new CartaoVacina();
        cartaoVacina.setCod( "1123123" );
        cartaoVacina.setQtdVacina( 1L );
        cartaoVacina.setVacinaPendente( "Nenhum" );
        cartaoVacina.setTelefone( montaTelefone() );

        cartaoVacinaJpaRepository.save( cartaoVacina );

        ItemVacina itemVacina = new ItemVacina();

        itemVacina.setVacina( montaVacina() );
        itemVacina.setCartaoVacina( cartaoVacina );
        itemVacina.setDataAplicacao( new Date() );
        itemVacina.setObservacao( "Aplicado Vacina De raiva nos dois chorros do dono" );

        itemVacinaJpaRepository.save( itemVacina );

        Consulta consulta = new Consulta();

        consulta.setHora( LocalDateTime.now() );
        consulta.setCartaoVacinaConsulta( cartaoVacina );
        consulta.setProfSaude( montaProfSaude() );
        consulta.setHorarioDisponivel( HorarioDisponivel.DISPONIVEL );

        consultaJpaRepository.save( consulta );

    }

    private ProfSaude montaProfSaude() {

        ProfSaude profSaude = new ProfSaude();
        profSaude.setSenha( "101010" );
        profSaude.setUsuario( "1010" );
        profSaudeJpaRepository.save( profSaude );
        return profSaude;
    }

    private Vacina montaVacina() {

        Vacina vacina = new Vacina();
        vacina.setDataVenc( date );
        vacina.setDose( "Primeira Dose" );
        vacina.setLote( 55 );
        vacina.setNome( "Raiva" );
        vacina.setObservacao( "Aplicação obrigatoria para caes e Gatos" );
        return vacina;
    }

    private Telefone montaTelefone() {
        Telefone tel = new Telefone();
        tel.setNumero( "12312312" );
        tel.setTipo( TipoTelefone.TELEFONE );
        tel.setEndereco( montaEndereco() );
        return tel;
    }

    private Endereco montaEndereco() {

        Endereco endereco = new Endereco();
        endereco.setNumero( "1223" );
        endereco.setBairro( "Qualquer 1" );
        endereco.setCep( "654654654" );
        endereco.setEstado( "MG" );
        endereco.setCidade( "udia" );
        endereco.setRua( "SemNome" );
        return endereco;
    }
}
