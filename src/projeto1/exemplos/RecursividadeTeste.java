package projeto1.exemplos;

import javax.swing.JOptionPane;

import projeto1.exemplos.Recursividade;

public class RecursividadeTeste {

	public static void main(String[] args) {
		
		Recursividade r1 = new Recursividade();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero a ser fatorado: ")); // convers�o String p/ int
		int fatorial = r1.fatorial(numero);
		JOptionPane.showMessageDialog(null, "O fatorial de " + Integer.toString(numero) + " �: " + Integer.toString(fatorial));

	}

}
