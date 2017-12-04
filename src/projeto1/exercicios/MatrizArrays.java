package projeto1.exercicios;

import java.util.Random;

public class MatrizArrays {

	public static void main(String[] args) {
			
		Random random = new Random();
		
			int maior = 0;
		
			int[][] matriz = new int[4][4];
			
			System.out.println("Matriz");
			
			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz[i].length; j++) {
					
			//		matriz[i][j] = (int)(Math.random()*10); //10 posicao 0-9
					matriz[i][j] = random.nextInt(10);
				}
				
			}
			
			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz[i].length; j++) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}	
			
			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz[i].length; j++) {
										
					if((maior) < (matriz[i][j])) {
						
						maior = matriz[i][j];
						
					}  
				}
					
			}
				
			System.out.println("\nMaior número: ");
			System.out.println(maior);
			System.out.println("\nPosição do maior número: ");
					
			
			for (int i = 0; i < matriz.length; i++) {
				
				for (int j = 0; j < matriz[i].length; j++) {
					
					if (maior == matriz[i][j]) {
					System.out.print(i + " ");
					System.out.println(j);
					}
				}
				
				
		    }
	
	}

}
