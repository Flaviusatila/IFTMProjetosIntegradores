package eVacina.evacina.entites;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_item_vacina")
public class ItemVacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private LocalDate dataAplicacao;

    private String observacao;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemVacina that = ( ItemVacina ) o;
        return Objects.equals( Id, that.Id ) && Objects.equals( dataAplicacao, that.dataAplicacao ) && Objects.equals( observacao, that.observacao );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, dataAplicacao, observacao );
    }
}
