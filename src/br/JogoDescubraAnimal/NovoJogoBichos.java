package br.JogoDescubraAnimal;

import java.util.Scanner;

class Node {

	public String animal;
	private String afirmacao;
	public Node sim;
	public Node nao;

	public String getAfirmacao() {
		return afirmacao;
	}
	
	public boolean ehAfirmacao() {
		return (afirmacao != null && !afirmacao.isEmpty());
	}
	
	public void setAfirmacao(String afirmacao) {
		this.afirmacao = afirmacao;
	}

	public Node (String afirmacao, String animal){
		this.afirmacao = afirmacao;
		this.animal = animal;
	}

}

public class NovoJogoBichos {

	static Scanner s = new Scanner(System.in);
	static String opcao;


	public static void main(String[] args) {

		String resposta = null;
		Node rodada;
		Node jogoAnterior = null;
		Node jogo;
		Boolean respostaAnterior = false;
		Boolean sair = false;    

		rodada = new Node ("Vive na terra",null);
		rodada.sim = new Node(null,"Cavalo");
		rodada.nao = new Node(null,"Baleia");


		System.out.println("***************JOGO INICIADO***************\nAo final do jogo digite: \nQualquer caracter para continuar ou 'Exit' - para sair\n");

		do {
			try {
				jogo = rodada;
				
				while (jogo.ehAfirmacao()) {
					
					System.out.println(jogo.getAfirmacao()+ "?");
					do {
						resposta = s.next();
					} while (resposta.isEmpty());
					
					jogoAnterior = jogo;
					
					if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
						respostaAnterior = true;
						jogo = jogo.sim;
					} else {
						respostaAnterior = false;
						jogo = jogo.nao;
					}
				}

			
				System.out.println("O animal é " + jogo.animal + "?");
				resposta = s.next();
				verificar(resposta, jogo, jogoAnterior, respostaAnterior);

				if ("Exit".equalsIgnoreCase(opcao)) {
					sair = true;
				}

			} catch (Exception e) {
				System.out.println("Erro durante o processamento do comando");
				sair = false;
			}           
		} while (!sair);


	}

	public static void verificar(String resposta, Node animal, Node jogoAnterior, Boolean respostaAnterior) {
		String nome = "";
		String caracteristica = "";

		if ("sim".equalsIgnoreCase(resposta)) {
			System.out.println("Animal descoberto!");
			limpar(animal, nome, caracteristica);
			opcao = s.next();
		} else {
			System.out.println("Qual animal é?");
			do {  
				nome = s.nextLine();
			} while (nome.isEmpty());
			System.out.println("O que o(a) " + nome + " tem que o(a) " + animal.animal + " não tem?");
			caracteristica = s.nextLine();
			criarAnimal(nome, caracteristica, animal, jogoAnterior, respostaAnterior);
			limpar(animal, nome, caracteristica);
			opcao = s.nextLine();
		}
	}

	public static void criarAnimal(String nome, String caracteristica,Node animalAtual, Node jogoAnterior, Boolean respostaAnterior) {
		Node novo = new Node(caracteristica,null);
		novo.sim = new Node(null,nome);
		novo.nao = animalAtual;
		if (respostaAnterior) {
			jogoAnterior.sim= novo;
		} else {
			jogoAnterior.nao= novo;
		}
	}

	public static void limpar(Node supostoAnimal, String nome, String caracteristica) {
		supostoAnimal = null;
		nome = "";
		caracteristica = "";
	}


}

