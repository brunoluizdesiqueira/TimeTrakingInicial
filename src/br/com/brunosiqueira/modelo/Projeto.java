package br.com.brunosiqueira.modelo;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	private int id;
	private String nome;
	private List<Tarefa> tarefas;
	private Cliente cliente;
	
	public Projeto(String nome) {
		super();
		this.tarefas = new ArrayList<Tarefa>();
		this.nome = nome;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas.addAll(tarefas);
	}
	
	public StringBuilder getAllDescricaoTarefas(){
		StringBuilder descricao = new StringBuilder();
		
		this.tarefas.forEach(t -> descricao.append("- Descricao da tarefa: " + t.getDescricao() + ' '));
				
		return descricao;		
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public String getNome() {
		return nome;
	}
	
    public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
