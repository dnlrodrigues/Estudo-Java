package br.JogoDescubraAnimal;

import java.util.Scanner;


class RodadaJogo {

	public String animal;
	public String afirmacao;
	public RodadaJogo sim;
	public RodadaJogo nao;

	public String getAfirmacao() {
		return afirmacao;
	}
	public void setAfirmacao(String afirmacao) {
		this.afirmacao = afirmacao;
	}

	public RodadaJogo(String afirmacao, String animal) {
		this.afirmacao = afirmacao;
		this.animal = animal;
	}	
}



public class NovaClasseAnimal {

	static Scanner s = new Scanner(System.in);
	static RodadaJogo rodada;
	static String resposta;
	static RodadaJogo supostoAnimal;
	static RodadaJogo jogoAnterior;
	static RodadaJogo animalDefault;
	static String nome, caracteristica, opcao;
	static Boolean respostaAnterior = false;

	public static void main(String[] args) {

		Boolean sair = false;	

		rodada = new RodadaJogo ("Vive na água", null);
		rodada.sim = new RodadaJogo (null, "Baleia");
		rodada.nao = new RodadaJogo (null, "Cavalo");
		RodadaJogo jogo = rodada;

		System.out.println("Ao final do jogo digite: \nQualquer caracter para continuar ou 'Exit' - para sair\n");

		do {
			try {
				jogo = rodada;
				while (jogo != null) {
					jogoAnterior = jogo;

					if (jogo.afirmacao != null) {
						System.out.println(jogo.getAfirmacao()+ "?");
						do {
							resposta = s.nextLine();
						} while (resposta.isEmpty());
						
						if ("Baleia".equals(jogo.sim.animal)) {
							if ("sim".equalsIgnoreCase(resposta)) {
								animalDefault = new RodadaJogo(null, "Baleia");
							} else if ("Cavalo".equals(jogo.nao.animal)) {
								animalDefault = new RodadaJogo(null, "Cavalo");
							}
						}
					} 

					if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
						supostoAnimal = jogo.sim;
						respostaAnterior = true;
						jogo = jogo.sim;
					} else {
						supostoAnimal = jogo.nao;
						respostaAnterior = false;
						jogo = jogo.nao;
					}
				}

				if (supostoAnimal == null) {
					System.out.println("O animal é " + jogoAnterior.animal + "?" );
					resposta = s.next();
					verificar(resposta, jogoAnterior);
	
				}

				if (supostoAnimal != null) {
					System.out.println("O animal é " + supostoAnimal.sim.animal + "?");
					resposta = s.next();
					verificar(resposta, supostoAnimal);
				}

		
				if ("Exit".equalsIgnoreCase(opcao)) {
					sair = true;
				}

			} catch (Exception e) {
				System.out.println("Erro durante o processamento do comando");
				sair = false;
			}		
		} while (!sair);


	}

	public static void verificar(String resposta, RodadaJogo animal) {
		if ("sim".equalsIgnoreCase(resposta)) {
			System.out.println("Animal descoberto!");
			limpar();
			opcao = s.next();
		} else {
			System.out.println("Qual animal é?");
			do {	
				nome = s.nextLine();
			} while (nome.isEmpty());
			System.out.println("O que o(a) " + nome + " tem que o(a) " + animal.animal + " não tem?");
			caracteristica = s.nextLine();
			criarAnimal(animal, nome, caracteristica);
			limpar();
			opcao = s.nextLine();
		}
	}

	public static void criarAnimal(RodadaJogo animal, String nome, String caracteristica) {
		RodadaJogo novo = new RodadaJogo(caracteristica, null);
		if (respostaAnterior) {
			jogoAnterior.sim= novo;			
		} else {
			jogoAnterior.nao= novo;		
		}
		novo.sim = new RodadaJogo(null, nome);
		
		if ("Baleia".equals(animalDefault.animal)) {
			novo.nao = new RodadaJogo(null, "Baleia");
		} else if ("Cavalo".equals(animalDefault.animal)) {
			novo.nao = new RodadaJogo(null, "Cavalo");
		}

	}

	public static void limpar() {
		animalDefault = null;
		resposta = "";
		supostoAnimal = null;
		nome = null;
		caracteristica = null;
	}

}


