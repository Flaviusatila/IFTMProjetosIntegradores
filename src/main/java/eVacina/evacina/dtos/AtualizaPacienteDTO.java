package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import eVacina.evacina.entites.Telefone;
import eVacina.evacina.service.validations.AtualizaPacienteValid;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@AtualizaPacienteValid
public class AtualizaPacienteDTO {

    @JsonProperty("cpf")
    @NotEmpty(message = "Nao pode ser vazio o cpf")
    @Length(min = 11,max = 11, message = "O tamanho de ser 11 numeros")
    private String cpf;

    @NotEmpty(message = "Nao pode ser vazio o nome")
    @Length(min = 5,max = 80, message = "O tamanho de ser entre 5 e 80 letras")
    @JsonProperty("nome")
    @NotNull
    private String nome;

    @JsonProperty("apelido")
    private String apelido;

    @JsonProperty("telefone")
    @NotEmpty(message = "Nao pode ser vazio o telefone")
    @Length(min = 8, max = 20, message = "O tamanho de ser entre 8 e 20 numeros")
    private Telefone telefone;

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

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


}
