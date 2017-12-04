package projeto1.exercicios.contaBancaria;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	

	public ContaEspecial(String nomeCliente, int numConta, double limite) {
		setNomeCliente(nomeCliente);
		setNumConta(numConta);
		setLimite(limite);
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void sacar(double valor) {
		double saldoTotal = getSaldo()+limite;
		if (saldoTotal >= valor) {
			double novoSaldo = getSaldo() - valor;
			setSaldo(novoSaldo);
		} else {
			System.out.println("Não é possível efetuar saque, valor solicitado maior que o disponível");
		}
	}


		
	
}
