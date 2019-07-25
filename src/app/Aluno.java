package app;

public class Aluno extends Pessoa {
	private static String[] turmas = new String [50];
	
	public Aluno(String nome, String email, String turma){
		super(nome, email);
		adicionaTurma(turma);
		
	}
	
	private void adicionaTurma(String turma) {
		for(int i=0;i<turmas.length;i++) {
			if(turmas[i]==null) {
				turmas[i]=turma;
			}
		}
	}
}

