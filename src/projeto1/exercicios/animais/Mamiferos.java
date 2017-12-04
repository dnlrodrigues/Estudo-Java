package projeto1.exercicios.animais;

public abstract class Mamiferos extends Animais {
	
	private String alimento;

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAlimento: " + alimento + "\n";
	}
	
	

}
