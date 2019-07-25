package app;

public abstract class Questao {
	private String tipo;
	private String titulo;
	private String resposta;
	
	public Questao(String tipo, String titulo, String resposta){
		this.tipo = tipo;
		this.titulo = titulo;
		this.resposta = resposta;
	}
	
	public abstract String toString(); 
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo(){
		return tipo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public String getTitulo(){
		return titulo;
	}
	
	public void setResposta(String resposta){
		this.resposta = resposta;
	}
	
	public String getResposta(){
		return resposta;
	}
}

