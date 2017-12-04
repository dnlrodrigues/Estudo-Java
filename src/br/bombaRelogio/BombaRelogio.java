package br.bombaRelogio;

import javax.swing.JOptionPane;

public class BombaRelogio {

	private int tempo = 0;

	public int getTempo() {
		return tempo;
	}

	private void setTempo(int tempo) {
		if (tempo > 0) {
			this.tempo = tempo;
		} else {
			System.out.println("Tempo inválido");
		}
	}

	public void criarBomba () {
		try {
			int tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite um tempo em segundos para bomba explodir"));
			setTempo(tempo);
		} catch (Exception e) {
			System.out.println("Valor digitado inválido");
		}
		explosao();
	}

	private void explosao() {
		int tempoExplosao = getTempo();
		if (tempoExplosao != 0){
			int i = tempoExplosao;
			while (i > 0) {
				System.out.println(i);
				i--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Defeito na bomba!");
				}
			}
			System.out.println("KABUM!!!");
		} else {
			criarBomba();
		}
	}


}
