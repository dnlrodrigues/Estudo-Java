package projeto1.exercicios;

public class Somatoria {
	
				
		public static int soma(int num){
			
			if (num == 0) {
				return num;
			}
			
			return num += soma(num -1);
			
		}
	
}
