package app;

public class Numerica extends Questao {
	
	public Numerica(String titulo, String resposta){
		super("Num�rica",titulo,resposta);
	}
	
	@Override
	public String toString(){
		return "\n" + getTipo() + "\n" + getTitulo();
	}
}

