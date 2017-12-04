package br.buscaBinaria;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
	
	private int numero;
	private int palpite;
	/*private Jogo jogo1;
	private Jogo jogo2;
	
	public Jogo getJogo1() {
		return jogo1;
	}

	public void setJogo1(Jogo jogo1) {
		this.jogo1 = jogo1;
	}

	public Jogo getJogo2() {
		return jogo2;
	}

	public void setJogo2(Jogo jogo2) {
		this.jogo2 = jogo2;
	}*/

	public int getNumero() {
		return numero;
	}

	public int getPalpite() {
		return palpite;
	}

	public void setPalpite(int palpite) {
		this.palpite = palpite;
	}
	
	Random random = new Random();
	
	public void gerarNumero() {
		numero = random.nextInt(10000);
	}
	
	public String maiorOuMenor() {
		if (palpite < numero) {
			return "Maior que " + palpite;
		} else {
			return "Menor que " + palpite;
		}
	}
	
	public Boolean validarResposta() {
		if (palpite == numero) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public void solicitarPalpite() {
		int numeroPalpite = Integer.parseInt(JOptionPane.showInputDialog("Digite um palpite: "));
		try {
			setPalpite(numeroPalpite);
		} catch (Exception e) {
			System.out.println("Palpite inválido");
		}
	}
	
	@Override
	public String toString() {
		return "\n\nNúmero Secreto: " + numero +
			   "\nPalpite: " + palpite;
	}
	
	
	
	
}
