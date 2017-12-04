package projeto1.exercicios.FiguraGeometrica;

public class Quadrado extends Figura2D {

	private double lado, area;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Quadrado(String cor, double lado) {
		setCor(cor);
		setNome("Quadrado " + cor);
		try {
			setLado(lado);
		} catch (Exception e) {
			System.out.println("Valor inválido!");
		}
	}
	
	@Override
	public double calcularArea() {
		return area = Math.pow(lado, 2);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLado: " + lado + "\nArea: " + area;
	}
	
}
