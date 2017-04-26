package br.com.brunosiqueira.modelo;

public class Colaborador extends Pessoa {
	private String email;
	private String senha;
	private String login;
	
	public Colaborador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Colaborador(String nome, StatusPessoa status, String email, String senha, String login) {
		super();

		super.setNome(nome);
		super.setStatus(status);
		this.setEmail(email);
		this.setLogin(login);
		this.setSenha(senha);
		this.setStatus(status);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return this.getNome();
	}

}
