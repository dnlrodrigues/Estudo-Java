package projeto1.exercicios.FiguraGeometrica;

public class Piramide extends Figura3D {

	private double lado, altura, areaBase, area, volume;
		
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Piramide (String cor, double lado, double altura) {
		setCor(cor);
		setNome("Pir‚mide " + getCor());
		try {
			setLado(lado);
			setAltura(altura);
		} catch (Exception e) {
			System.out.println("Valor inv·lido!");
		}
	}
	
	@Override
	public double calcularVolume() {
		areaBase = Math.pow(lado, 2);
		return volume = areaBase  * altura / 3;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nLado: " + lado + "\nVolume: " + volume + "\n¡rea Total: ";
	}

	@Override
	public double calcularArea() {
		return area = 3 * (altura * lado / 2) + areaBase;
	}
}
