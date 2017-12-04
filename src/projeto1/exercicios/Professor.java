package projeto1.exercicios;

public class Professor {

	private String nome, departamento, email;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimir() {
		System.out.println("Nome do professor: " + nome);
		System.out.println("Nome do departamento: " + departamento);
		System.out.println("E-mail: " + email + "\n");
	}
	
	@Override
	public String toString() {
		return "Nome do professor: " + nome + 
				"\n" + "Nome do departamento: " + departamento + 
				"\n" + "E-mail: " + email;  
	}
	
	
}
