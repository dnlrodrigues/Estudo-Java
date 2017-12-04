package br.ArvoreBinariaDeBusca;

import java.util.Random;
import java.util.Scanner;

class Node {
	public Node maior;
	public Node menor;
	
	public int valor;
	
	
	public Node(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Node valor: " + valor +"[Maior: " + maior + "	Menor: " + menor + "]";
	}
	
	
}

class ArvoreBinariaDeBuscaMarota {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Node noInicial = new Node(50);
		
		for (int i = 0; i < 30; i++) {
			Node novoNode = new Node(random.nextInt(100));
			Node noAtual = noInicial;
			Node noAnterior = noInicial;
			while(noAtual != null) {
				noAnterior = noAtual;				
				if (novoNode.valor > noAtual.valor) {				
					noAtual = noAtual.maior;					
				}else if(novoNode.valor < noAtual.valor) 
				{
					noAtual = noAtual.menor;
				}else
				{
					break;
				}
			}
			
			if (noAtual == null) {//Se o nóAtual for Nulo, quer dizer que NÃO encontrou o valor
				if (novoNode.valor > noAnterior.valor) {
					noAnterior.maior = novoNode;
				}else {
					noAnterior.menor = novoNode;
				}
			}else {
				System.out.println("Valor já estava na arvore: "+noAtual.valor);
			}
			
		}
		
		System.out.println(noInicial);
		

	}

}



public class ArvoreBinariaDeBusca{
	static Node noInicial;

	public static void main(String[] args) {
		Boolean sair = false;
		String opcao = null;
		Scanner s = new Scanner(System.in);
		
		do {
			try {
				System.out.println("Digite: \n1 - Inserir número(s)\n2 - Busca um número\n3 - Limpar lista\n4 - Sair");
				opcao = s.next();
				if ("1".equalsIgnoreCase(opcao)) {
					System.out.println("Para parar de inserir digite a letra 'q'");
					noInicial = new Node(s.nextInt());
					String escolha = s.next();

					while(!"q".equalsIgnoreCase(escolha)) {
						inserirNumeros(Integer.parseInt(escolha));
						escolha = s.next();
					}

				} else if ("2".equalsIgnoreCase(opcao)) {
					System.out.println("Digite um valor a ser localizado");
					int numero = s.nextInt();
					buscarNumeros(numero);
					
				} else if ("3".equalsIgnoreCase(opcao)) {
					System.out.println("Deseja limpar a lista?");
					String limpar =s.next();
					if ("sim".equalsIgnoreCase(limpar)){
						limpaLista();
					}
					
				} else if ("4".equalsIgnoreCase(opcao)){
					sair = true;
				}
			} catch (Exception e) {
				System.out.println("Erro na execução do comando");
				opcao = "3";
			}
		} while (!sair);



		System.exit(0);
	}

	public static void inserirNumeros(int numero) {		
		Node no = new Node(numero);
		Node noAtual = noInicial;
		Node noAnterior = noInicial;

		while (noAtual!= null) {
			noAnterior = noAtual;
			if (no.valor > noAtual.valor) {
				noAtual = noAtual.maior;
			} else if (no.valor < noAtual.valor) {
				noAtual = noAtual.menor;
			} else {
				break;
			}
		}
		
		if (no.valor > noAnterior.valor) {
			noAnterior.maior = no;
		} else if (no.valor < noAnterior.valor) {
			noAnterior.menor = no;
		}  else {
			System.out.println("Valor já existente");
		}
		
	}
	
	public static void buscarNumeros(int numero) {
		Node noBusca = noInicial;
		
		
		while (noBusca != null) {
			
			if (noBusca.valor != numero) {
				
				if (noBusca.valor > numero) {
					 noBusca = noBusca.menor;
				 } else {
					 noBusca = noBusca.maior;
				 } 
			} else {
				break;
			}
		 }
		

		if (noBusca == null) {
			 System.out.println("Valor inexistente");
		 } else {
			 System.out.println("Valor localizado!");
		 }
		
		System.out.println("\n" + noInicial);
	}
		
	public static void limpaLista(){
		noInicial = null;
	}
	
}
