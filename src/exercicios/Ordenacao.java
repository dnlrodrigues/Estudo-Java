package exercicios;

import java.util.Random;

public class Ordenacao {
		
		Random r = new Random();
	
		public void ordenar() {
			
			int[] array = new int[10];
			
			for (int i = 0; i < array.length; i++) {
				array[i] = r.nextInt(31);
			}
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			
			int aux, menor; 
			//int p= 0;
			
				 
			for (int i = 0; i < array.length-1; i++) {
					menor = i;
				for (int j = i+1; j < array.length; j++) {					
				//	if (array[i] > array[j]) {
					if (array[menor] > array[j]) {
						menor = j;
					/*	aux = array[i];
						array[i] = array[p];
						array[p] = aux;*/
						
					} 
				}	
					
				aux = array[i];
				array[i] = array[menor];
				array[menor] = aux; 	
				
				}		
		
		
				
			System.out.println();
			
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
}
