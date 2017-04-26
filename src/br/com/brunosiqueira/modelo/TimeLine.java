package br.com.brunosiqueira.modelo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeLine {
	private Integer id;
	private LocalDateTime instante;
	private TipoTransicao transicao;
	private String descricao;
	private Pessoa pessoaParecer;

	public TimeLine() {
		super();
		new ArrayList<LocalDateTime>();
	}
	
	public TimeLine(TipoTransicao transicao, String descricao, Pessoa pessoaParecer) {
		super();
		this.transicao = transicao;
		this.descricao = descricao;
		this.setPessoaParecer(pessoaParecer);
		this.instante = LocalDateTime.now();	
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public TipoTransicao getTransicao() {
		return transicao;
	}

	public void setTransicao(TipoTransicao transicao) {
		this.transicao = transicao;
	}
		
	public LocalDateTime getInstante() {
		return instante;
	}

	public void setInstante(LocalDateTime instante) {
		this.instante = instante;
	}
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Pessoa getPessoaParecer() {
		return pessoaParecer;
	}
	
	public void setPessoaParecer(Pessoa pessoaParecer) {
		this.pessoaParecer = pessoaParecer;
	}
	
	// metodo apenas para exemplo, em breve estarei removendo
	public void iniciaCronometro() {
		Timer timer = null;

		final SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

		if (timer == null) {
			timer = new Timer();
			TimerTask tarefa = new TimerTask() {
				public void run() {
					try {
						System.out.println("Hora: " + format.format(new Date().getTime()));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			};
			timer.scheduleAtFixedRate(tarefa, 0, 1000);
		}
	}

}
