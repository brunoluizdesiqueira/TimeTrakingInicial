package br.com.brunosiqueira.excecao;

public class MinhaExcecao extends RuntimeException {
  private final String value;

	public MinhaExcecao(String value) {
		super("Minha excecao: " + value);
		
		this.value = value;	  
	}
	
	public String getValue() {
		return value;
	}

}
	