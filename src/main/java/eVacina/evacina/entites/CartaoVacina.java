package eVacina.evacina.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_cartao_vacina")
public class CartaoVacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Long cod;

    private Long qtdVacina;

    private String vacinaPendente;

    private String observacoes;

    @OneToOne(cascade = CascadeType.ALL)
    private Telefone telefone;

    @OneToMany(mappedBy = "cartaoVacina", fetch = FetchType.EAGER)
    private List<ItemVacina> itemVacinas;


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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public List<ItemVacina> getItemVacinas() {
        return itemVacinas;
    }

    public void setItemVacinas(List<ItemVacina> itemVacinas) {
        this.itemVacinas = itemVacinas;
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
