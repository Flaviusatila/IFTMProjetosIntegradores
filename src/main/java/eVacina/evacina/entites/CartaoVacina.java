package eVacina.evacina.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class CartaoVacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long cod;

    private Long qtdVacina;

    private String vacinaPendente;

    private String observacoes;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Long getCod() {
        return cod;
    }

    public void setCod(Long cod) {
        this.cod = cod;
    }

    public Long getQtdVacina() {
        return qtdVacina;
    }

    public void setQtdVacina(Long qtdVacina) {
        this.qtdVacina = qtdVacina;
    }

    public String getVacinaPendente() {
        return vacinaPendente;
    }

    public void setVacinaPendente(String vacinaPendente) {
        this.vacinaPendente = vacinaPendente;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CartaoVacina that = ( CartaoVacina ) o;
        return Objects.equals( Id, that.Id ) && Objects.equals( cod, that.cod ) && Objects.equals( qtdVacina, that.qtdVacina ) && Objects.equals( vacinaPendente, that.vacinaPendente ) && Objects.equals( observacoes, that.observacoes );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, cod, qtdVacina, vacinaPendente, observacoes );
    }
}
