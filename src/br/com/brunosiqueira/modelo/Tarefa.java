package br.com.brunosiqueira.modelo;

import java.time.LocalDate;
import java.util.List;

public class Tarefa {
	private int id;
    private String titulo;
	private String descricao;
	private TipoTarefa tipo;
	private Colaborador responsavel;
	private Colaborador membro;
	private LocalDate criacao;
	private TimeTracking timeTracking;
	
	// Ver uma forma de vincular um cliente -> projeto
	// deve ser buscado por cliente e assiciado um dos projetos deste cliente
	private Projeto projeto; 
	private List<Tag> tag;

	public Tarefa(String descricao, Colaborador responsavel, Colaborador membro) {
		super();
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.membro = membro;
		this.criacao = LocalDate.now();
		
		this.timeTracking = new TimeTracking();
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
		
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTarefa getTipo() {
		return tipo;
	}

	public void setTipo(TipoTarefa tipo) {
		this.tipo = tipo;
	}

	public Colaborador getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Colaborador responsavel) {
		this.responsavel = responsavel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Tag> getTag() {
		return tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;
	}

	public LocalDate getCriacao() {
		return criacao;
	}

	public void setCriacao(LocalDate criacao) {
		this.criacao = criacao;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Colaborador getMembro() {
		return membro;
	}

	public void setMembro(Colaborador membro) {
		this.membro = membro;
	}
	
   public TimeTracking getTimeTracking() {
		return timeTracking;
	}

	
}
