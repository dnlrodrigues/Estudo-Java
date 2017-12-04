package projeto1.exercicios.FiguraGeometrica;

public class Cubo extends Figura3D{

	double aresta, area, volume;
	
	public double getAresta() {
		return aresta;
	}


	public void setAresta(double aresta) {
		this.aresta = aresta;
	}

	public Cubo (String cor, double aresta) {
		setCor(cor);
		setNome("Cubo " + cor);	
		try {
			setAresta(aresta);
		} catch (Exception e) {
			System.out.println("Valor inv·lido!");
		}
	}
	
	@Override
	public double calcularVolume() {
		return volume = Math.pow(aresta, 3);		
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAresta: " + aresta + "\nVolume: " + volume + "\n¡rea Total: ";
	}


	@Override
	public double calcularArea() {
		return area = 6 * (Math.pow(aresta, 2));
	}
	
}
