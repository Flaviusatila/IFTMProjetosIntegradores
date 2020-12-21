package eVacina.evacina.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class ProfSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long usuario;

    private Long senha;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

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
