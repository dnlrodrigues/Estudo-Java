package projeto1.exercicios.exceptions;

public class Contato {

	private String nome, telefone;
	private int identificador;
	private static int cont;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws DadoInvalidoException{
		if (nome != null) {
			this.nome = nome;
		} else {
			throw new DadoInvalidoException();
		}
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) throws DadoInvalidoException{
		if (telefone.length() >= 8) {
			this.telefone = telefone;
		} else {
			throw new DadoInvalidoException();
		}
	}
	
	public Contato (String nome, String telefone) throws DadoInvalidoException {
			setNome(nome);
			setTelefone(telefone);
			identificador = cont++;
	}

	@Override
	public String toString() {
		return "Contato \nNome: " + nome + " - Telefone: " + telefone + " - identificador: " + identificador;
	}

	
	
	
}
