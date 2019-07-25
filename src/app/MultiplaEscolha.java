package app;

import app.Alternativa;
public class MultiplaEscolha extends Questao {
	private String [] alternativas = new String [5];
	private String resp;
	private boolean v=false;
	
	public MultiplaEscolha(String titulo, String resposta,String [] alternativas){
		super("Dissertativa", titulo, resposta);
		
		for(int i=0;i<5;i++) {
			if(alternativas[i]==null) {
				System.out.println("Essa alternativa � verdadeira?");
					if(resp.equals("sim") || resp.equals("Sim")|| resp.equals("SIM")) {
						if(v==true) {
							System.out.println("J� existe uma alternativa verdadeira");
						}
						else {
							v=true;
						}	
					}
				System.out.println("Escreva a alternativa");
								
			}
			if(i+1 == 5) {
				System.out.println("N�mero m�ximo de alternativas atingido");
			}
		}
		
	}
	
	
	@Override
	public String toString(){
		return "\n" + getTipo() + "\n" + getTitulo() + "\n" ;
	}
}

