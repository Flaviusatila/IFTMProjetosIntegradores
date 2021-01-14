package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.Consulta;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.entites.ProfSaude;
import eVacina.evacina.entites.enums.HorarioDisponivel;

import java.time.LocalDateTime;

public class ConsultaDTO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy@HH:mm")
    @JsonProperty("hora_consulta")
    private String hora;

    @JsonProperty("local_consulta")
    private String local;

//    private HorarioDisponivel horarioDisponivel;


    public ConsultaDTO() {
    }

    public ConsultaDTO(String hora, String local, HorarioDisponivel horarioDisponivel, Paciente paciente, CartaoVacina cartaoVacinaConsulta, ProfSaude profSaude) {
        this.hora = hora;
        this.local = local;
//        this.horarioDisponivel = horarioDisponivel;
    }

    public ConsultaDTO(Consulta consulta) {
        this.hora = consulta.getHora();
        this.local = consulta.getLocal();
//        this.horarioDisponivel = HorarioDisponivel.DISPONIVEL;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

//    public HorarioDisponivel getHorarioDisponivel() {
//        return horarioDisponivel;
//    }

//    public void setHorarioDisponivel(HorarioDisponivel horarioDisponivel) {
//        this.horarioDisponivel = horarioDisponivel;
//    }

}
