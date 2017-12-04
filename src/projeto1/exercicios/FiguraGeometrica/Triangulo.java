package projeto1.exercicios.FiguraGeometrica;

public class Triangulo extends Figura2D{

	double lado, area;	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Triangulo(String cor, double lado) {
		setCor(cor);
		setNome("Triangulo Equilátero " + cor);
		try {
			setLado(lado);
		} catch (Exception e) {
			System.out.println("Valor inválido!");
		}
	}
	
	@Override
	public double calcularArea() {
		return area = ((Math.sqrt(3)) / 4) * Math.pow(lado, 2);	
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLado: " + lado + "\nArea: " + area;
	}
	
}
