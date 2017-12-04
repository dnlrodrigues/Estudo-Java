package projeto1.exercicios;

import javax.swing.JOptionPane;

public class AgendaTeste {

	public static void main(String[] args) {
		
		AgendaContato ac1 = new AgendaContato();
				
		ac1.setNome(JOptionPane.showInputDialog("Digite o nome da Agenda: "));
		
		Contato[] contatos = new Contato[2];
		
		for (int i = 0; i < contatos.length; i++) {
			Contato c = new Contato();
			c.setNome(JOptionPane.showInputDialog("Digite o nome do contato: "));
			c.setEmail(JOptionPane.showInputDialog("Digite o e-mail do contato"));
			c.setTelefone(JOptionPane.showInputDialog("Digite o telefone do Contato"));	
			
			contatos[i] = c;
		}
		
		ac1.setContatos(contatos);
		
		if(ac1 != null) {
			System.out.println(ac1.imprimirAgenda());
		}
		
	}
	
	

}
