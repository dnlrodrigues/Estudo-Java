package projeto1.exercicios.contaBancaria;

public class ContaPoupanca extends ContaBancaria {

	private double taxaRendimento;
	
	public ContaPoupanca(String nomeCliente, int numConta, double diaRendimento) {
		setNomeCliente(nomeCliente);
		setNumConta(numConta);
		setTaxaRendimento(diaRendimento);
	}
	
	public double getTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento/100;
	}

	public ContaPoupanca(String nomeCliente, int numConta) {
		setNomeCliente(nomeCliente);
		setNumConta(numConta);
	}
	
	public void calcularNovoSaldo() {
		double saldoRendimento;
		saldoRendimento = getSaldo();
		saldoRendimento*= taxaRendimento;
		depositar(saldoRendimento);
	}
	
	
	
	
	
}
