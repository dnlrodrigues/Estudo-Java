package projeto1.exemplos;

import javax.swing.JOptionPane;

public class MatrizIrregular {

	public static void main(String[] args) {
		
	    String message = JOptionPane.showInputDialog(null, "Digite o número de Entrevistados: ");
		int numerosEntrevistados = (Integer.parseInt(message));
	    
		String[][] nomesFilhos = new String[numerosEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			
			String message2 =  JOptionPane.showInputDialog("Digite um número de filhos: ");
			int numerosFilhos = (Integer.parseInt(message2));
			nomesFilhos[i] = new String[numerosFilhos];
			
		
			for (int j = 0; j<nomesFilhos[i].length; j++) {
				String message3 = JOptionPane.showInputDialog("Digite o nome dos filhos: ");
				nomesFilhos[i][j] = message3;
			}
			
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa: " + i + " tem " + nomesFilhos[i].length + " filhos.");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(" Filhos: " + nomesFilhos[i][j]);
			}
		}
		
		
	}

}
