package br.com.dobackaofront.cadastro.entity;

import java.util.List;

public class Usuario {

	public int id;
	public String nome;
	public String cpf;
	public String sexo;
	public String login;
	public String senha;
	public String cargo;
	public List<String>habilidades;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String cpf,String sexo, String login, String senha,
			String cargo, List<String>habilidades) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.login = login;
		this.senha = senha;
		this.cargo = cargo;
		this.habilidades = habilidades;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
