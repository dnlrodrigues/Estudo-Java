package projeto1.exercicios.receitaFederal;

import javax.swing.JOptionPane;

public class ContribuinteCPF extends Contribuinte{

	public ContribuinteCPF (String tipoContribuinte) {
		String nomeContribuinte = JOptionPane.showInputDialog("Digite o nome do contribuinte: ");
		double rendaBruta = 0;
		
		try {
			rendaBruta = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda bruta do contribuinte: "));
		} catch (Exception e) {
			System.out.println("Valor inválido!");
		}
		
		if (tipoContribuinte != null && !nomeContribuinte.isEmpty()) {
			setNomeContribuinte(nomeContribuinte);
			setTipoContribuinte(tipoContribuinte);
			setRendaBruta(rendaBruta);
		} else {
			JOptionPane.showMessageDialog(null, "Cadastro inválido!");
		}
	}
	
	public double calcularImpostoCPF() {
		double imposto=0;
		double rendaBruta = getRendaBruta();
		if (rendaBruta > 0 && rendaBruta < 1400) {
			setAliquota(0);
			setParcDeduzir(0);
			imposto = calcularImposto();
		} else if (rendaBruta > 1400 && rendaBruta < 2100) {
			setAliquota(10);
			setParcDeduzir(100);
			imposto = calcularImposto();
		} else if (rendaBruta > 2100 && rendaBruta < 2800) {
			setAliquota(15);
			setAliquota(270);
			imposto = calcularImposto();
		} else if (rendaBruta > 2800 && rendaBruta < 3600) {
			setAliquota(25);
			setParcDeduzir(500);
		} else if (rendaBruta > 3600) {
			setAliquota(30);
			setParcDeduzir(700);
			imposto = calcularImposto();
		} else {
			System.out.println("Renda Bruta inválida!");
			liberado = false;
		}
		return imposto;
	}
	
	
}
