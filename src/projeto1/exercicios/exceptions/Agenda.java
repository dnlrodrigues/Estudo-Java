package projeto1.exercicios.exceptions;

public class Agenda {
	
	static int cont = 0;
	Contato[] contatos = new Contato[4];
	
	public void adicionarContato(String nome, String telefone) throws AgendaCheiaException {
		if (cont < contatos.length) {
			try {
				Contato contato = new Contato(nome, telefone);
				contatos[cont] = contato;
				cont++;
			} catch (DadoInvalidoException e) {
				System.out.println("O contato não foi adicionado");
			}
		} else {
			throw new AgendaCheiaException();
		}
}
	
	public Contato consultarContato(String nome, String telefone) throws ContatoNaoExisteException  {

		if (!nome.isEmpty()) {
			for (int i = 0; i < contatos.length; i++) {
				if (contatos[i].getNome().equalsIgnoreCase(nome)) {
					System.out.println("Contato encontrado!");
					return contatos[i];
				} 
			}
		} else if (!telefone.isEmpty()) {
			for (int i = 0; i < contatos.length; i++) {
				if (contatos[i].getTelefone().equalsIgnoreCase(telefone)) {
					System.out.println("Contato encontrado!");
					return contatos[i];
				}
			}
		}
		throw new ContatoNaoExisteException();
	}
	

	public void imprimir() {
		for (Contato contato : contatos) {
			if (contato != null) {
			System.out.println(contato.toString());
			}
		}
	}
	
	
	
}
