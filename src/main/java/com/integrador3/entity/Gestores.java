package com.integrador3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gestores {
	
	private Long cadastro_gestor;
	private String nome_gestor;
	private String email;
	private Long cpf;
	private String password;
	private String login;
	
	
	protected Gestores() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getCadastro_gestor() {
		return cadastro_gestor;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome_gestor() {
		return nome_gestor;
	}

	public void setNome_gestor(String nome_gestor) {
		this.nome_gestor = nome_gestor;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setCadastro_gestor(Long cadastro_gestor) {
		this.cadastro_gestor = cadastro_gestor;
	}
	
}
