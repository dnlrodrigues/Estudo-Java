package projeto1.exemplos;

public class Arrays{

	public static void main(String[] args) {
		
			double[] temperaturas = new double[3];
			
			temperaturas[0]= 31.2;
			temperaturas[1]= 32;
			temperaturas[2]= 33.7;
			
			for (double temp : temperaturas) {
				System.out.println("Temperaturas: " + temp);
			}
			
			int [][] matrizes = new int[3][2];
			
			matrizes[0][0] = 10;
			matrizes[0][1] = 7;
			matrizes[1][0] = 9;
			matrizes[1][1] = 6;
			matrizes[2][0] = 8;
			matrizes[2][1] = 5;
			
			for (int i = 0; i < matrizes.length; i++) {
				
				for (int j = 0; j < matrizes[i].length; j++) {
					System.out.print(matrizes[i][j] + " - ");
				}
				System.out.println();
			}
			
			double soma;
			
			for (int i = 0; i < matrizes.length; i++) {
				
				soma= 0;
				
				for (int j = 0; j < matrizes[i].length; j++) {
					soma+= matrizes[i][j];
				}
				System.out.println("A média é: " + soma);
			}
			
		/*	int[] notas = {5, 6 , 9 , 4};
			
			for (int i : notas) {
				System.out.print(i + " - ");
			}*/
					
			int [][] notas2 = {{1, 2, 3, 4}, {1, 7, 8, 9}};
			
			for (int i = 0; i < notas2.length; i++) {
				
				for (int j = 0; j < notas2[i].length; j++) {
					System.out.print(notas2[i][j] + " - ");
				}
				System.out.println(notas2.length);
			}
 	}

}
