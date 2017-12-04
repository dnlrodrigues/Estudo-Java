package projeto1.exercicios.FiguraGeometrica;

public class Cilindro extends Figura3D {

	private double raio, altura, volume;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Cilindro(String cor, double altura, double raio) {
		setCor(cor);
		setNome("Cilindro " + cor);
		try {
			setAltura(altura);
			setRaio(raio);
		} catch (Exception e) {
			System.out.println("Valor inv·lido!");
		}
	}
	
	@Override
	public double calcularVolume() {
		return volume = Math.PI * Math.pow(raio, 2) * altura;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRaio: " + raio + "\nVolume: " + volume + "\n¡rea Total: ";
	}

	@Override
	public double calcularArea() {
		return  2 * Math.PI * raio * (raio + altura);
	}
	
}
