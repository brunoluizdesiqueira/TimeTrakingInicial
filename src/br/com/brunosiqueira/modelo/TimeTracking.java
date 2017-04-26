package br.com.brunosiqueira.modelo;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TimeTracking {
	private Integer id;
	private List<TimeLine> timeLine;
	
	public TimeTracking() {
		super();
	    this.timeLine = new ArrayList<TimeLine>();
	}
		
	public Duration getTempoTotal() {	
	  return Duration.between(this.timeLine.get(0).getInstante(), this.timeLine.get(this.timeLine.size() -1).getInstante());
	}
	
	public Integer getId() {
		return id;
	}

	public List<TimeLine> getTimeLine() {
		return timeLine;
	}

	public void setTimeLine(List<TimeLine> timeLine) {
		this.timeLine = timeLine;
	}
	
	public void registrar(TipoTransicao transicao, String descricao, Pessoa pessoaParecer){
	   timeLine.add(new TimeLine(transicao, descricao, pessoaParecer));		
	}
	
}
