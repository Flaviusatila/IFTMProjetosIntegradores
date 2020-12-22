package eVacina.evacina.entites;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String rua;

    private String numero;

    private String bairro;

    private String estado;

    private String cep;

    private String cidade;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = ( Endereco ) o;
        return Objects.equals( Id, endereco.Id ) && Objects.equals( rua, endereco.rua ) && Objects.equals( numero, endereco.numero ) && Objects.equals( bairro, endereco.bairro ) && Objects.equals( estado, endereco.estado ) && Objects.equals( cep, endereco.cep ) && Objects.equals( cidade, endereco.cidade );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, rua, numero, bairro, estado, cep, cidade );
    }
}
