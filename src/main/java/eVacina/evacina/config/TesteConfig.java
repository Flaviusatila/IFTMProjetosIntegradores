//package eVacina.evacina.config;
//
//import eVacina.evacina.dtos.CadastrarPacienteDTO;
//import eVacina.evacina.entites.*;
//import eVacina.evacina.entites.enums.HorarioDisponivel;
//import eVacina.evacina.entites.enums.TipoTelefone;
//import eVacina.evacina.repository.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//
//import java.time.LocalDateTime;
//import java.util.Date;
//
//@Configuration
//@Profile("test")
//public class TesteConfig implements CommandLineRunner {
//
//    @Autowired
//    private CartaoVacinaJpaRepository cartaoVacinaJpaRepository;
//
//    @Autowired
//    private ItemVacinaJpaRepository itemVacinaJpaRepository;
//
//    @Autowired
//    private ConsultaJpaRepository consultaJpaRepository;
//
//    @Autowired
//    private ProfSaudeJpaRepository profSaudeJpaRepository;
//
//    @Autowired
//    private PacienteJpaRepository pacienteJpaRepository;
//
//    private static final Date date = new Date( 2020, 22, 11 );
//
//    @Override
//    public void run(String... args) {
//
//
//        CartaoVacina cartaoVacina = new CartaoVacina();
//        cartaoVacina.setCod( "1123123" );
//        cartaoVacina.setQtdVacina( 1L );
//        cartaoVacina.setVacinaPendente( "Nenhum" );
//        cartaoVacina.setTelefone( montaTelefone() );
//
//        cartaoVacinaJpaRepository.save( cartaoVacina );
//
//        ItemVacina itemVacina = new ItemVacina();
//
//        itemVacina.setVacina( montaVacina() );
//        itemVacina.setCartaoVacina( cartaoVacina );
//        itemVacina.setDataAplicacao( new Date() );
//        itemVacina.setObservacao( "Aplicado Vacina De raiva nos dois chorros do dono" );
//
//        itemVacinaJpaRepository.save( itemVacina );
//
//        Consulta consulta = new Consulta();
//
//        consulta.setHora( LocalDateTime.now() );
//        consulta.setCartaoVacinaConsulta( cartaoVacina );
//        consulta.setProfSaude( montaProfSaude() );
////        consulta.setHorarioDisponivel( HorarioDisponivel.DISPONIVEL );
//
//        consultaJpaRepository.save( consulta );
//
//        Paciente cadastrarPacienteDTO = new Paciente();
//        cadastrarPacienteDTO.setNome("Flavius");
//        cadastrarPacienteDTO.setCpf("01234567891");
//        cadastrarPacienteDTO.setApelido("Lindao");
//        cadastrarPacienteDTO.setDataCastro(new Date());
//
//        CartaoVacina cartaoVacina2 = new CartaoVacina();
//        cartaoVacina2.setCod( "1123123" );
//        cartaoVacina2.setQtdVacina( 1L );
//        cartaoVacina2.setVacinaPendente( "Nenhum" );
//        cartaoVacina2.setTelefone( montaTelefone() );
//
//        Paciente cadastrarPacienteDTO2 = new Paciente();
//        cadastrarPacienteDTO2.setNome("Angoti");
//        cadastrarPacienteDTO2.setCpf("01234567892");
//        cadastrarPacienteDTO2.setApelido("professor");
//        cadastrarPacienteDTO2.setDataCastro(new Date());
//
//        CartaoVacina cartaoVacina3 = new CartaoVacina();
//        cartaoVacina3.setCod( "1123123" );
//        cartaoVacina3.setQtdVacina( 1L );
//        cartaoVacina3.setVacinaPendente( "Nenhum" );
//        cartaoVacina3.setTelefone( montaTelefone() );
//
//        Paciente cadastrarPacienteDTO3 = new Paciente();
//        cadastrarPacienteDTO3.setNome("Carlos");
//        cadastrarPacienteDTO3.setCpf("01234567893");
//        cadastrarPacienteDTO3.setApelido("Integrante");
//        cadastrarPacienteDTO3.setDataCastro(new Date());
//
//        CartaoVacina cartaoVacina4 = new CartaoVacina();
//        cartaoVacina4.setCod( "1123123" );
//        cartaoVacina4.setQtdVacina( 1L );
//        cartaoVacina4.setVacinaPendente( "Nenhum" );
//        cartaoVacina4.setTelefone( montaTelefone() );
//
//        Paciente cadastrarPacienteDTO4 = new Paciente();
//        cadastrarPacienteDTO4.setNome("Rodrigo");
//        cadastrarPacienteDTO4.setCpf("01234567894");
//        cadastrarPacienteDTO4.setApelido("Integrandte");
//        cadastrarPacienteDTO4.setDataCastro(new Date());
//
//        pacienteJpaRepository.save(cadastrarPacienteDTO);
//        cartaoVacinaJpaRepository.save(cartaoVacina2);
//        pacienteJpaRepository.save(cadastrarPacienteDTO2);
//        cartaoVacinaJpaRepository.save(cartaoVacina3);
//        pacienteJpaRepository.save(cadastrarPacienteDTO3);
//        cartaoVacinaJpaRepository.save(cartaoVacina4);
//        pacienteJpaRepository.save(cadastrarPacienteDTO4);
//    }
//
//    private ProfSaude montaProfSaude() {
//
//        ProfSaude profSaude = new ProfSaude();
//        profSaude.setSenha( "101010" );
//        profSaude.setUsuario( "1010" );
//        profSaudeJpaRepository.save( profSaude );
//        return profSaude;
//    }
//
//    private Vacina montaVacina() {
//
//        Vacina vacina = new Vacina();
//        vacina.setDataVenc( date );
//        vacina.setDose( "Primeira Dose" );
//        vacina.setLote( 55 );
//        vacina.setNome( "Raiva" );
//        vacina.setObservacao( "Aplicação obrigatoria para caes e Gatos" );
//        return vacina;
//    }
//
//    private Telefone montaTelefone() {
//        Telefone tel = new Telefone();
//        tel.setNumero( "12312312" );
//        tel.setTipo( TipoTelefone.TELEFONE );
//        tel.setEndereco( montaEndereco() );
//        return tel;
//    }
//
//    private Endereco montaEndereco() {
//
//        Endereco endereco = new Endereco();
//        endereco.setNumero( "1223" );
//        endereco.setBairro( "Qualquer 1" );
//        endereco.setCep( "654654654" );
//        endereco.setEstado( "MG" );
//        endereco.setCidade( "udia" );
//        endereco.setRua( "SemNome" );
//        return endereco;
//    }
//}
