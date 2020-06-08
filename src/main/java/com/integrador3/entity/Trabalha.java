package com.integrador3.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabalha {
	
	private Long cod_projeto;
	private Date data_inicio;
	private Date data_fim;
	private Long cod_env;
	
	protected Trabalha() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCod_Env() {
		return cod_env;
	}

	public Long getCod_projeto() {
		return cod_projeto;
	}

	public void setCod_projeto(Long cod_projeto) {
		this.cod_projeto = cod_projeto;
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

	public Long getCod_env() {
		return cod_env;
	}

	public void setCod_env(Long cod_env) {
		this.cod_env = cod_env;
	}
	
}
