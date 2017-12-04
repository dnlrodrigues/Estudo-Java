package projeto1.exemplos;

public class Matrizes3Dimensao {

	public static void main(String[] args) {

		int[][][] cubo = new int[3][3][3];
		
		for (int i = 0; i < cubo.length; i++) {
			for (int j = 0; j < cubo[i].length; j++) {
				for (int k = 0; k < cubo[i].length; k++) {
					cubo[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma =0;
		int somaPares = 0;
		int somaImpares = 0;
		
		for (int i = 0; i < cubo.length; i++) {
			for (int j = 0; j < cubo[i].length; j++) {
				for (int k = 0; k < cubo[i].length; k++) {
					soma += cubo[i][j][k];
					
					if(cubo[i][j][k] % 2 == 0) {
						somaPares += cubo[i][j][k];
					} else {
						somaImpares += cubo[i][j][k];
					}
				}
			}
		}
		
		System.out.println(soma);
		System.out.println(somaPares);
		System.out.println(somaImpares);

	}

}
