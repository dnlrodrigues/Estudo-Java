package exercicios;

import java.util.Random;

import javax.swing.JOptionPane;

public class OrdenacaoSwap {

	private int[] array = new int[10];
	
	Random r = new Random();
	
	public void criarArray() {
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(10);
		}		
	}
	
	public void imprimirArray() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
	}
	
	public void trocarPosicoes() {
		int positionFirst = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira posicao a ser trocada"));
		int positionLast = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira posicao a ser trocada"));
		System.out.println("\nPrimeira posição a ser trocada: " + positionFirst + "\nSegunda posição a ser trocada: " + positionLast);
		swap(array, positionFirst, positionLast);
		System.out.println("\nArray trocado pelo método SWAP: ");
	}
	
	public void swap(int[] arrayOrdenar, int posicaoInicial, int posicaoFinal) {
	    int aux = array[posicaoInicial];
		array[posicaoInicial] = array[posicaoFinal];
		array[posicaoFinal] = aux;
	}
	
	public void bubbleSort() {
		Boolean swapped = false;
		
		do {
			swapped = false;
			for (int i = 0; i < array.length -1; i++) {
				
				if (array[i] > array[i+1]) {
					swap(array, i, i+1);
					swapped = true;
					}
				}
			} while (swapped);
		
		System.out.println("\nArray trocado pelo método BubbleSort: ");
	}
	
}
