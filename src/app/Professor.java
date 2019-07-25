package app;

public class Professor extends Pessoa {
	private String departamento, nome, email;
	

	
	public Professor(String nome, String email, String departamento){
		super(nome, email);
		this.setDepartamento(departamento);
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}

