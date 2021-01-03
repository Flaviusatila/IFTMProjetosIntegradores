package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import eVacina.evacina.entites.Telefone;
import org.hibernate.annotations.NotFound;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class CadastrarPacienteDTO {

    @JsonProperty("cpf")
    @NotNull
    private String cpf;

    @JsonProperty("nome")
    @NotNull
    private String nome;

    @JsonProperty("apelido")
    private String apelido;

    @JsonProperty("telefone")
    private Telefone telefone;

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    @Temporal( TemporalType.DATE )
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataCastro;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataCastro() {
        return dataCastro;
    }

    public void setDataCastro(Date dataCastro) {
        this.dataCastro = dataCastro;
    }
}
