package projeto1.exercicios;

public class Contato {

	private String nome, telefone, email;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String imprimirContato() {
		return "Nome do Contato: " + getNome() +
							"\nE-mail: " + getEmail() + 
				            "\nTelefone: " + getTelefone();
	}	
	
}
