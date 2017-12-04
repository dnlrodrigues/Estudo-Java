package br.buscaBinaria;

public class JogoTeste {

	static boolean sair = false;
	static int i = 0;
	
	public static void main(String[] args) {
		
		Jogo jogo = new Jogo();
		jogo.gerarNumero();
		
		/*Jogo jogoMaroto1 = new Jogo();
		Jogo jogoMaroto2 = new Jogo();
		
		jogo.setJogo1(jogoMaroto1);
		jogo.setJogo2(jogoMaroto2);
		
		jogo.getJogo1().gerarNumero();*/
		
		do {
			jogo.solicitarPalpite();
			boolean resposta = jogo.validarResposta();
			i++;
			if (resposta) {
				i--;
				sair = true;
			} else {
				System.out.println(jogo.maiorOuMenor());
			}
		} while(!sair);
		
		System.out.println(jogo + "\nNúmero de Tentativas: " + i);
		
		System.exit(0);
		
	
		
		
		

	}

	

}
