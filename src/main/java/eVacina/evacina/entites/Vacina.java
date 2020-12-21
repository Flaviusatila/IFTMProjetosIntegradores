package eVacina.evacina.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nome;

    private String dose;

    private String observacao;

    private Integer lote;

    private LocalDate dataVenc;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        this.Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public LocalDate getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(LocalDate dataVenc) {
        this.dataVenc = dataVenc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vacina that = ( Vacina ) o;
        return Objects.equals( Id, that.Id ) && Objects.equals( nome, that.nome ) && Objects.equals( dose, that.dose ) && Objects.equals( observacao, that.observacao ) && Objects.equals( lote, that.lote ) && Objects.equals( dataVenc, that.dataVenc );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, nome, dose, observacao, lote, dataVenc );
    }
}
