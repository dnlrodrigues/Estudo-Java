package projeto1.exercicios.animais;

public abstract class Animais {

	private String nome, cor, ambiente;
	private double comprimento, velocidade;
	private int patas;
	
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
	
	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public int getPatas() {
		return patas;
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	@Override
	public String toString() {
		return "Tipo do Animal: " + nome +
				"\nComprimento: " + comprimento + " cm" +
				"\nNº de patas: " + patas +
				"\nCor: " + cor +
				"\nAmbiente: " + ambiente +
				"\nVelocidade: " + velocidade + " m/s";
	}
	
	
}
