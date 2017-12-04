package projeto1.exercicios;

import javax.swing.JOptionPane;

public class SomatoriaTeste {

	public static void main(String[] args) {
		
		Somatoria s = new Somatoria();
		
		int numero, total; 
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo: "));
		total = s.soma(numero);
		JOptionPane.showMessageDialog(null, "O valor total da somatória do número " + numero + " é " + total);

	}

}
