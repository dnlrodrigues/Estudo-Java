package projeto1.exercicios.exceptions;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		
		Boolean sair = false;
		Agenda agenda = new Agenda();

		do {
			while (!sair) {
			String menu = JOptionPane.showInputDialog("Digite: \n1 - para consultar um contato da agenda."
				  	  + "\n2 - para adicionar um contato na agenda." 
				  	  + "\n3 - para sair da agenda.");
			if ("1".equals(menu)) {
				String nome = JOptionPane.showInputDialog("Digite um nome: ");
				String telefone = JOptionPane.showInputDialog("Digite um telefone: ");
				try {
					Contato c = agenda.consultarContato(nome, telefone);
					System.out.println(c);
				} catch (ContatoNaoExisteException e) {
					System.out.println("Contato Inexistente!");
				} catch (NullPointerException e) {
					System.out.println("Não existe contato na agenda!");
				}
			} 
			if ("2".equals(menu)) {
				String nome = JOptionPane.showInputDialog("Digite um nome: ");
				String telefone = JOptionPane.showInputDialog("Digite um telefone: ");
				try {
					agenda.adicionarContato(nome, telefone);
				} catch (AgendaCheiaException e) {
					System.out.println(e.getMessage());
				}
				
			}
			if ("3".equals(menu)) {
				agenda.imprimir();
				System.exit(0);
			} 				
			}
		} while (!sair);
		
	}

}
