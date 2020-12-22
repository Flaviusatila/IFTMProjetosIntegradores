package eVacina.evacina.entites;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String cpf;

    private String nome;

    private String apelido;

    private LocalDate dataCastro;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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

    public LocalDate getDataCastro() {
        return dataCastro;
    }

    public void setDataCastro(LocalDate dataCastro) {
        this.dataCastro = dataCastro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = ( Paciente ) o;
        return Objects.equals( Id, paciente.Id ) && Objects.equals( cpf, paciente.cpf ) && Objects.equals( nome, paciente.nome ) && Objects.equals( apelido, paciente.apelido ) && Objects.equals( dataCastro, paciente.dataCastro );
    }

    @Override
    public int hashCode() {
        return Objects.hash( Id, cpf, nome, apelido, dataCastro );
    }
}
