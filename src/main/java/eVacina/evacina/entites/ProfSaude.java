package eVacina.evacina.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_prof_saude")
public class ProfSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long usuario;

    private Long senha;

    @OneToMany(mappedBy = "profSaude", fetch = FetchType.EAGER)
    private List<Consulta> consultas;

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public Long getSenha() {
        return senha;
    }

    public void setSenha(Long senha) {
        this.senha = senha;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfSaude profSaude = ( ProfSaude ) o;
        return Objects.equals( Id, profSaude.Id ) && Objects.equals( usuario, profSaude.usuario ) && Objects.equals( senha, profSaude.senha );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, usuario, senha );
    }
}
