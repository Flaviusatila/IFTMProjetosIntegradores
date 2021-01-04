package eVacina.evacina.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;
import eVacina.evacina.entites.Consulta;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CadastrarDadosCartaoVacinaDTO {

    @JsonProperty("cpf")
    @NotNull
    private String cpf;

    @JsonProperty("usuario_profissional_saude")
    private String usuario;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("procedimentos")
    private String procedimentos;

    @JsonProperty("obesevacoes_vacina")
    private String observacoesVacina;

    @JsonProperty("dose")
    private String dose;

    @JsonProperty("data_aplicacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataAplicacao;

    @JsonProperty("lote")
    private Integer lote;

    @JsonProperty("data_venc")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dataVenc;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }

    public String getObservacoesVacina() {
        return observacoesVacina;
    }

    public void setObservacoesVacina(String observacoesVacina) {
        this.observacoesVacina = observacoesVacina;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public Date getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(Date dataVenc) {
        this.dataVenc = dataVenc;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }


}
