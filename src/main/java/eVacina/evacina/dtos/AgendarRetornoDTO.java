package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import eVacina.evacina.entites.Consulta;


public class AgendarRetornoDTO {

    @JsonProperty("cpf")
    @NotNull
    private String cpf;

    @JsonProperty("usuario")
    private String usuario;

    @JsonProperty("consulta")
    private Consulta consulta;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
