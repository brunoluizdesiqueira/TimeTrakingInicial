package br.com.brunosiqueira.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

	private List<Projeto> projetos;


	public Cliente(String nome, Projeto projeto) {
		super();
		this.projetos = new ArrayList<Projeto>();

		this.setNome(nome);				
		this.setProjeto(projeto);
	}

	public List<Projeto> getAllProjetos() {
		return projetos;
	}

	public Projeto getProjeto(Projeto p) {

		if (this.projetos.contains(p)) {
			return this.projetos.get(this.projetos.indexOf(p));
		}
		else {
			return null;
		}
	}

	public void setProjeto(Projeto projeto) {
		this.projetos.add(projeto);
	}
}
