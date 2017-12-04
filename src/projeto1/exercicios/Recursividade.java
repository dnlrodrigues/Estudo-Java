package projeto1.exercicios;

public class Recursividade {

					
		public static int seqFibonnaci(int num) {
			
		if (num < 2) {
			return 1;
		}
	
		return seqFibonnaci(num-1) + seqFibonnaci(num-2);
		}
}
