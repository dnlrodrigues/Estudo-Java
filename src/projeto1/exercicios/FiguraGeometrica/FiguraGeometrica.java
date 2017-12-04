package projeto1.exercicios.FiguraGeometrica;

public abstract class FiguraGeometrica {

	private String nome, cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica \nNome: " + nome + "\nCor=" + cor;
	}
	
	
	
	
}
