package projeto1.exemplos;

public class Recursividade {

	public static int fatorial(int num) {
		
		if (num == 0) {
			return num = 1;
		}	
		
		return num*fatorial(num-1);
				
	}
	
}
