package projeto1.exercicios.FiguraGeometrica;

public class Circulo extends Figura2D{

private	double raio, area;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

    public Circulo(String cor, double raio) {
    	setCor(cor);
    	setNome("Círculo " + cor);

    	try {
    		setRaio(raio);
    	} catch (Exception e) {
    		System.out.println("Valor inválido!");
    	}
    }
	
	@Override
	public double calcularArea() {
		return area = Math.PI *(Math.pow(raio, 2));
		
	}

	@Override
	public String toString() {
		return super.toString() + "\nRaio: " + raio + "\nArea: " + area;
	}

	
	
}
