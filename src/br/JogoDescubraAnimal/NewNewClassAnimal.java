package br.JogoDescubraAnimal;

import java.util.Scanner;

class ItensAnimais {
	public String animal;
	public String caracteristica = "";

	public ItensAnimais anteriorAnimal;
	public ItensAnimais proximoAnimal;


	public ItensAnimais (String animal) {
		this.animal = animal;
	}

	public String getAnimal() {
		return animal;
	}

	public ItensAnimais getProximoAnimal() {
		return proximoAnimal;
	}

	public ItensAnimais getAnteriorAnimal() {
		return proximoAnimal;
	}

	public String getCaracteristica() {
		return caracteristica;
	}
}

public class NewNewClassAnimal {

	static ItensAnimais lista1, lista2;
	static ItensAnimais ultimoAnimal = new ItensAnimais(null);
	static ItensAnimais penultimo = new ItensAnimais(null);
	static ItensAnimais animalSuspeito = new ItensAnimais(null);

	public static void main(String[] args) {

		String nome, caracteristica;
		String exit = null;
		String resposta = null;

		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);

		lista1 = new ItensAnimais("Baleia");
		lista2 = new ItensAnimais("Cavalo");

		do {        
			ItensAnimais animaisDaLista1 = lista1;
			ItensAnimais animaisDaLista2 = lista2;

			System.out.println("Vive na água?");
			resposta = s.next();

			if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {

				if (animaisDaLista1.proximoAnimal == null) {
					System.out.println("É uma Baleia?");
					resposta = s.next();

					if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
						System.out.println("Animal descoberto!");
						resposta = null;
					} else {
						System.out.println("Qual animal é?");
						nome = ss.nextLine();
						criarItensAnimais(nome, animaisDaLista1);
						System.out.println("O que " + nome + " tem que o(a) "+ animaisDaLista1.getAnimal() + " não tem?");
						caracteristica = ss.nextLine();
						addCaracteristica(caracteristica);
						resposta = null;
					}
				} else {

					while (animaisDaLista1.proximoAnimal != null) {
						while (animaisDaLista1.proximoAnimal != null){
							System.out.println("O animal " + animaisDaLista1.getCaracteristica() + "?" );
							resposta = s.next();
							if("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
								animalSuspeito = animaisDaLista1;								
								animaisDaLista1 = animaisDaLista1.proximoAnimal;
							} else {
								animaisDaLista1 = animaisDaLista1.proximoAnimal;
							}
						}
					}
					if (animalSuspeito.animal != null){ 
						System.out.println("O animal é um(a) " + animalSuspeito.getAnimal()+"?");
						resposta = s.next();
						if ("sim".equalsIgnoreCase(resposta)) {
							System.out.println("Animal descoberto!");
							resposta = null;
							animalSuspeito = null;
						} else {
							System.out.println("Qual animal é?");
							nome = ss.nextLine();
							criarItensAnimais(nome, animaisDaLista1);
							System.out.println("O que " + nome + " tem que o(a) "+ animalSuspeito.getAnimal() + " não tem?");
							caracteristica = ss.nextLine();
							addCaracteristica(caracteristica);
							resposta = null;
							animalSuspeito = null;
						} 
					} else {
						System.out.println("É uma baleia?");
						resposta = s.next();

						if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
							System.out.println("Animal descoberto!");
							resposta = null;
						} else {
							System.out.println("Qual animal é?");
							nome = ss.nextLine();
							criarItensAnimais(nome, animaisDaLista1);
							System.out.println("O que " + nome + " tem que o(a) "+ animaisDaLista1.getAnimal() + " não tem?");
							caracteristica = ss.nextLine();
							addCaracteristica(caracteristica);
							resposta = null;
						}

					}
				} 
			}     
			else {

				if (animaisDaLista2.proximoAnimal == null) {
					System.out.println("É uma cavalo?");
					resposta = s.next();

					if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
						System.out.println("Animal descoberto!");
						resposta = null;
					} else {
						System.out.println("Qual animal é?");
						nome = ss.nextLine();
						criarItensAnimais(nome, animaisDaLista2);
						System.out.println("O que " + nome + " tem que o(a) "+ animaisDaLista2.getAnimal() + " não tem?");
						caracteristica = ss.nextLine();
						addCaracteristica(caracteristica);
						resposta = null;
					}

				} else {

					while (animaisDaLista2.proximoAnimal != null) {
						while (animaisDaLista2.proximoAnimal != null){
							System.out.println("O animal " + animaisDaLista2.getCaracteristica() + "?" );
							resposta = s.next();

							if("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {


								if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)){
									animalSuspeito = animaisDaLista2;
									animaisDaLista2 = animaisDaLista2.proximoAnimal;
								} else {
									animaisDaLista2 = animaisDaLista2.proximoAnimal;
								}

							} else {
								animaisDaLista2 = animaisDaLista2.proximoAnimal;
							}
						}
					}
					if (animalSuspeito.animal != null){ 
						System.out.println("O animal é um(a) " + animalSuspeito.getAnimal()+"?");
						resposta = s.next();
						if ("sim".equalsIgnoreCase(resposta)) {
							System.out.println("Animal descoberto!");
							resposta = null;
							animalSuspeito = null;
						} else {
							System.out.println("Qual animal é?");
							nome = ss.nextLine();
							criarItensAnimais(nome, animaisDaLista2);
							System.out.println("O que " + nome + " tem que o(a) "+ animalSuspeito.getAnimal() + " não tem?");
							caracteristica = ss.nextLine();
							addCaracteristica(caracteristica);
							resposta = null;
							animalSuspeito = null;
						} 
					} else {
						System.out.println("É uma cavalo?");
						resposta = s.next();

						if ("sim".equalsIgnoreCase(resposta) || "tem".equalsIgnoreCase(resposta)) {
							System.out.println("Animal descoberto!");
							resposta = null;
						} else {
							System.out.println("Qual animal é?");
							nome = ss.nextLine();
							criarItensAnimais(nome, animaisDaLista2);
							System.out.println("O que " + nome + " tem que o(a) "+ animaisDaLista2.getAnimal() + " não tem?");
							caracteristica = ss.nextLine();
							addCaracteristica(caracteristica);
							resposta = null;
						}

					}

				}
			}

			System.out.println("\nDigite: Qualquer caracter para continuar ou Exit (para sair)");
			exit = s.next();

		} while (!exit.equalsIgnoreCase("exit"));
	}

	public static void addCaracteristica (String caracteristica){
		penultimo.caracteristica = caracteristica;
	}

	public static void buscarAnimal(ItensAnimais lista){

		while (lista != null){
			if (lista.proximoAnimal == null){
				ultimoAnimal = lista;
				lista = lista.proximoAnimal;
			} else {
				lista = lista.proximoAnimal;
			}
		}
	}

	public static void criarItensAnimais(String nome, ItensAnimais lista){

		ItensAnimais novo = new ItensAnimais(nome);
		buscarAnimal(lista);
		if (ultimoAnimal.anteriorAnimal != null){
			novo.proximoAnimal = ultimoAnimal;
			ultimoAnimal.anteriorAnimal.proximoAnimal = novo;
			novo.anteriorAnimal = ultimoAnimal.anteriorAnimal;
			ultimoAnimal.anteriorAnimal = novo;
			penultimo = ultimoAnimal.anteriorAnimal;
		} else {
			if (lista.equals(lista1)){
				lista1 = novo;
				lista1.proximoAnimal = ultimoAnimal;
				ultimoAnimal.anteriorAnimal = novo;
				penultimo = ultimoAnimal.anteriorAnimal;
			} else {
				lista2 = novo;
				lista2.proximoAnimal = ultimoAnimal;
				ultimoAnimal.anteriorAnimal = novo;
				penultimo = ultimoAnimal.anteriorAnimal;
			}

		}

	}
}
