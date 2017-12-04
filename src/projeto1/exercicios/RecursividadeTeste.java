package projeto1.exercicios;

import javax.swing.JOptionPane;

public class RecursividadeTeste {

	public static void main(String[] args) {
			
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números Fibonnaci que deseja visualizar: "));
		
			for (int i = 0; i <= n; i++) {
				
				Recursividade r = new Recursividade();
				int numero = r.seqFibonnaci(i);
				System.out.println(Integer.toString(numero) );
			}
			
	}

}
