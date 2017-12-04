package projeto1.exemplos;

import javax.swing.JOptionPane;

import projeto1.exemplos.Recursividade;

public class RecursividadeTeste {

	public static void main(String[] args) {
		
		Recursividade r1 = new Recursividade();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser fatorado: ")); // conversão String p/ int
		int fatorial = r1.fatorial(numero);
		JOptionPane.showMessageDialog(null, "O fatorial de " + Integer.toString(numero) + " é: " + Integer.toString(fatorial));

	}

}
