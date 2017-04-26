package br.com.brunosiqueira.modelo;

import java.time.LocalDate;

public abstract class Pessoa {
	private int id;
	private String nome;
	private StatusPessoa status;
	private LocalDate dataCadastro;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public StatusPessoa getStatus() {
		return status;
	}
	
	public void setStatus(StatusPessoa status) {
		this.status = status;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
}
