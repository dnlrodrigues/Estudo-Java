package projeto1.exercicios.animais;

public class Zoologico {

	public static void main(String[] args) {
		
		Camelo camelo = new Camelo();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2);
		camelo.setAlimento("Capim");
		
		Tubarao tubarao = new Tubarao();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setPatas(0);
		tubarao.setCor("Cinzento");
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(1.5);
		tubarao.setCaracteristica("Barbatanas e cauda");
		
		Urso_Canada  ursoCanada = new Urso_Canada();
		ursoCanada.setNome("Urso do Canadá");
		ursoCanada.setComprimento(180);
		ursoCanada.setPatas(4);
		ursoCanada.setCor("Vermelho");
		ursoCanada.setAmbiente("Terra");
		ursoCanada.setVelocidade(0.5);
		ursoCanada.setAlimento("Mel");
		
		System.out.println(camelo);
		System.out.println(tubarao);
		System.out.println(ursoCanada);
		

	}

}
