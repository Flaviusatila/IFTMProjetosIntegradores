package eVacina.evacina.entites;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import eVacina.evacina.entites.enums.HorarioDisponivel;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_consulta")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy@HH:mm")
    private LocalDateTime hora;

    private String local;

    @JsonProperty("horario_disponivel")
    private Integer horarioDisponivel;

    @OneToOne
    private Paciente paciente;

    @OneToOne
    private CartaoVacina cartaoVacinaConsulta;

    @OneToOne
    private ProfSaude profSaude;

    public Long getId() {
        return Id;
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

    public CartaoVacina getCartaoVacinaConsulta() {
        return cartaoVacinaConsulta;
    }

    public void setCartaoVacinaConsulta(CartaoVacina cartaoVacinaConsulta) {
        this.cartaoVacinaConsulta = cartaoVacinaConsulta;
    }

    public ProfSaude getProfSaude() {
        return profSaude;
    }

    public void setProfSaude(ProfSaude profSaude) {
        this.profSaude = profSaude;
    }

    public HorarioDisponivel getHorarioDisponivel() {
        return HorarioDisponivel.valueOf( horarioDisponivel);
    }

    public void setHorarioDisponivel(HorarioDisponivel horarioDisponivel) {
        if (horarioDisponivel != null)
        this.horarioDisponivel = horarioDisponivel.getCode();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = ( Consulta ) o;
        return Objects.equals( Id, consulta.Id ) && Objects.equals( hora, consulta.hora );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, hora );
    }
}
