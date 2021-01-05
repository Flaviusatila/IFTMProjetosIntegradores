package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.Consulta;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.entites.ProfSaude;

import java.time.LocalDateTime;

public class ConsultaDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy@HH:mm")
    @JsonProperty("hora_consulta")
    private LocalDateTime hora;

    @JsonProperty("local_consulta")
    private String local;

    @JsonProperty("horario_disponivel")
    private Integer horarioDisponivel;

//    @JsonProperty("nome_paciente")
//    private String nomePaciente;
//
//    @JsonProperty("codigo_cartao_vacina")
//    private String codCartapVacina;
//
//    @JsonProperty("usuario_profissional_saude")
//    private String usuarioProfSaude;

    public ConsultaDTO() {
    }

    public ConsultaDTO(LocalDateTime hora, String local, Integer horarioDisponivel, Paciente paciente, CartaoVacina cartaoVacinaConsulta, ProfSaude profSaude) {
        this.hora = hora;
        this.local = local;
        this.horarioDisponivel = horarioDisponivel;
//        this.nomePaciente = paciente.getNome();
//        this.codCartapVacina = cartaoVacinaConsulta.getCod();
//        this.usuarioProfSaude = profSaude.getUsuario();
    }

    public ConsultaDTO(Consulta consulta) {
        this.hora = consulta.getHora();
        this.local = consulta.getLocal();
        this.horarioDisponivel = consulta.getHorarioDisponivel().getCode();
//        this.nomePaciente = consulta.getPaciente().getNome();
//        this.codCartapVacina = consulta.getCartaoVacinaConsulta().getCod();
//        this.usuarioProfSaude = consulta.getProfSaude().getUsuario();
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getHorarioDisponivel() {
        return horarioDisponivel;
    }

    public void setHorarioDisponivel(Integer horarioDisponivel) {
        this.horarioDisponivel = horarioDisponivel;
    }

//    public String getNomePaciente() {
//        return nomePaciente;
//    }
//
//    public void setNomePaciente(String nomePaciente) {
//        this.nomePaciente = nomePaciente;
//    }
//
//    public String getCodCartapVacina() {
//        return codCartapVacina;
//    }
//
//    public void setCodCartapVacina(String codCartapVacina) {
//        this.codCartapVacina = codCartapVacina;
//    }
//
//    public String getUsuarioProfSaude() {
//        return usuarioProfSaude;
//    }
//
//    public void setUsuarioProfSaude(String usuarioProfSaude) {
//        this.usuarioProfSaude = usuarioProfSaude;
//    }
}
