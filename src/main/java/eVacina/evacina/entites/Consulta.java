package eVacina.evacina.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Date data;

    private LocalDateTime hora;

    private String local;

    @OneToOne
    private CartaoVacina cartaoVacinaConsulta;

    @OneToOne
    private ProfSaude profSaude;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Consulta consulta = ( Consulta ) o;
        return Objects.equals( Id, consulta.Id ) && Objects.equals( data, consulta.data ) && Objects.equals( hora, consulta.hora );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, data, hora );
    }
}
