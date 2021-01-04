package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import eVacina.evacina.entites.CartaoVacina;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.entites.Telefone;

import java.util.Date;

public class ConsultarPacientesCadastradosDTO {

    @JsonProperty("data_cadastro")
    private Date dataCastro;

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

    public ConsultarPacientesCadastradosDTO() {
    }

    public ConsultarPacientesCadastradosDTO(Paciente paciente, CartaoVacina cartaoVacina) {
        this.dataCastro = paciente.getDataCastro();
        this.cpf = paciente.getCpf();
        this.nome = paciente.getNome();
        this.telefone = cartaoVacina.getTelefone();
    }

    public Date getDataCastro() {
        return dataCastro;
    }

    public void setDataCastro(Date dataCastro) {
        this.dataCastro = dataCastro;
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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
