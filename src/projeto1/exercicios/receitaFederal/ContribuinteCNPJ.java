package projeto1.exercicios.receitaFederal;

import javax.swing.JOptionPane;

public class ContribuinteCNPJ extends Contribuinte{

	public ContribuinteCNPJ (String tipoContribuinte) {
		String nomeContribuinte = JOptionPane.showInputDialog("Digite o nome do contribuinte: ");
		double rendaBruta = 0; 
		
		try {
			rendaBruta = Double.parseDouble(JOptionPane.showInputDialog("Digite a renda bruta do contribuinte: "));
		} catch (Exception e) {
			System.out.println("Valor inv�lido!");
		}
		
		if (tipoContribuinte != null && !nomeContribuinte.isEmpty()) {
			setNomeContribuinte(nomeContribuinte);
			setTipoContribuinte(tipoContribuinte);
			setRendaBruta(rendaBruta);
		} else {
			JOptionPane.showMessageDialog(null, "Cadastro inv�lido!");
		}
	}
	
	public double calcularImpostoCNPJ() {
		double imposto = 0;
		double rendaBruta = getRendaBruta();
		
		if(rendaBruta > 0) {
			setAliquota(10);
			setParcDeduzir(100);
			imposto = calcularImposto();
		} else {
			System.out.println("Renda bruta inv�lida");
			liberado = false;
		}
		return imposto;
	}
	
}
