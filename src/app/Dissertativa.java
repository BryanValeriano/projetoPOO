package app;

public class Dissertativa extends Questao {

	public Dissertativa(String titulo, String resposta){
		super("Dissertativa", titulo, resposta);
	}
	
	@Override
	public String toString(){
		return "\n" + getTipo() + "\n" + getTitulo();
	}
}

