package eVacina.evacina.entites;

import eVacina.evacina.entites.enums.TipoTelefone;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private Integer tipo;

    private String numero;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public TipoTelefone getTipo() {
        return TipoTelefone.valueOf(tipo);
    }

    public void setTipo(TipoTelefone tipo) {
        if (tipo != null)
            this.tipo = tipo.getCode();
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = ( Telefone ) o;
        return Objects.equals( Id, telefone.Id ) && Objects.equals( tipo, telefone.tipo ) && Objects.equals( numero, telefone.numero );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, tipo, numero );
    }
}
