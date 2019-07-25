package app;
import app.Questao;

public class Questionario {
	private float pontuacao;
	public String questao; //depois verificar se havera login para nao deixar acesso publico
	public String resposta;
	private static Questao questoes [] = new Questao [5];
	
	public Questionario(float pontuacao, String questao, String resposta){
	this.setPontuacao(pontuacao);
	this.questao = questao;
	this.resposta = resposta;
	}
	
	public void criaQuestionario(String questao){
		for(int i=0; i<questoes.length;i++) {
			
		}
	}
	
	public float atribuiPontuacao(){
		return 0.0f;
	}

	public float getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(float pontuacao) {
		this.pontuacao = pontuacao;
	}
	
}

