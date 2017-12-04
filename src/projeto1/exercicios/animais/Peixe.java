package projeto1.exercicios.animais;

public abstract class Peixe extends Animais {

	private String caracteristica;

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nCaracteristica:" + caracteristica + "\n";
	}
	
}
