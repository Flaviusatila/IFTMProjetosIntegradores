package com.integrador3.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Colaboradores {

		private Long cadastro;
		private Long cadastro_gestor;
		private String nome;
		private String email;
		private Long cpf;
		private String papel;
		private String password;
		private String login;
		
		protected Colaboradores() {
			
		}
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getCadastro_gestor() {
			return cadastro_gestor;
		}

		public Long getCadastro() {
			return cadastro;
		}

		public void setCadastro(Long cadastro) {
			this.cadastro = cadastro;
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

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getPapel() {
			return papel;
		}

		public void setPapel(String papel) {
			this.papel = papel;
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
