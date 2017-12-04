package projeto1.exercicios;

public class AgendaContato {
	
	private String nome;
	private Contato[] contatos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String imprimirAgenda() {
		String dadosAgenda = "Nome da Agenda: " +  nome + "\n\n";
		if(contatos != null) {
			for (Contato c : contatos) {
				dadosAgenda += c.imprimirContato() + "\n\n";
				} 
			} else {
				System.out.println("Não exite contato gravado!");}
		return dadosAgenda;
	}
	
		

}
