package app;

public class Numerica extends Questao {
	
	public Numerica(String titulo, String resposta){
		super("Numérica",titulo,resposta);
	}
	
	@Override
	public String toString(){
		return "\n" + getTipo() + "\n" + getTitulo();
	}
}

