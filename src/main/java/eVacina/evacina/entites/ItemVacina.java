package eVacina.evacina.entites;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_item_vacina")
public class ItemVacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;


    private Date dataAplicacao;

    private String observacao;

    @ManyToOne
    @JoinColumn(name = "cartao_vacina_id")
    private CartaoVacina cartaoVacina;

    @OneToOne(cascade = CascadeType.ALL)
    private Vacina vacina;

    public ItemVacina() {
    }

    public ItemVacina(Date dataAplicacao, String observacao, String nome, String dose) {
        this.dataAplicacao = dataAplicacao;
        this.observacao = observacao;
        this.vacina.setNome( nome );
        this.vacina.setDose( dose );
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public CartaoVacina getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(CartaoVacina cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
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
