package com.integrador3.entity;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
public class Projetos {
 
	private Long cod_projeto;
	private String nome;
	private Date data_inicio;
	private Date data_fim;
	private String descricao;
	private String repositorio_github;
	private Long cadastro_gestor;
	
	protected Projetos() {
		
	}

	public Long getCod_projeto() {
		return cod_projeto;
	}

	public void setCod_projeto(Long cod_projeto) {
		this.cod_projeto = cod_projeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRepositorio_github() {
		return repositorio_github;
	}

	public void setRepositorio_github(String repositorio_github) {
		this.repositorio_github = repositorio_github;
	}

	public Long getCadastro_gestor() {
		return cadastro_gestor;
	}

	public void setCadastro_gestor(Long cadastro_gestor) {
		this.cadastro_gestor = cadastro_gestor;
	}
	
}
