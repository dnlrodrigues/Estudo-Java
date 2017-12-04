package projeto1.exercicios.FiguraGeometrica;

public class FigurasGeometricasTeste {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo("Azul", 2.5);
		
		Quadrado quadrado = new Quadrado("Amarelo", 4);
		
		Triangulo triangulo = new Triangulo ("Vermelho", 9);
		
		Cubo cubo = new Cubo ("Branco", 12);
		
		Cilindro cilindro = new Cilindro ("Verde", 8, 5);
		
		Piramide piramide = new Piramide ("Marrom", 12, 6);
		
		FiguraGeometrica[] figurasGeometricas = new FiguraGeometrica[6];
		figurasGeometricas[0] = circulo;
		figurasGeometricas[1] = quadrado;
		figurasGeometricas[2] = triangulo;
		figurasGeometricas[3] = cubo;
		figurasGeometricas[4] = cilindro;
		figurasGeometricas[5] = piramide;
		
		for (int i = 0; i < figurasGeometricas.length; i++) {
			
			System.out.println(figurasGeometricas[i].toString());
			
			if (figurasGeometricas[i] instanceof Figura2D) {
				Figura2D f2d = (Figura2D) figurasGeometricas[i];
				System.out.println(f2d.calcularArea());
			} 
			if (figurasGeometricas[i] instanceof Figura3D) {
				Figura3D f3d = (Figura3D) figurasGeometricas[i];
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
			
			System.out.println("--------------------------------------");
		}
		

	}

}
