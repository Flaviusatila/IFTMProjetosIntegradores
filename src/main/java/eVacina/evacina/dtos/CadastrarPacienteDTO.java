package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import eVacina.evacina.entites.Telefone;
import eVacina.evacina.service.validations.CadastraPacienteValid;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@CadastraPacienteValid
public class CadastrarPacienteDTO {

    @JsonProperty("cpf")
    @NotEmpty(message = "Nao pode ser vazio o cpf")
    @Length(min = 11,max = 11, message = "O tamanho de ser entre 11 numeros")
    private String cpf;

    @JsonProperty("nome")
    @NotEmpty(message = "Nao pode ser vazio o nome")
    @Length(min = 5,max = 80, message = "O tamanho de ser entre 5 e 80 letras")
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
