package projeto1.exercicios.contaBancaria;

public abstract class ContaBancaria {

	private String nomeCliente;
	private int numConta;
	private double saldo=0;
	
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (this.saldo >= valor) {
		System.out.println("Sacou: " + valor);	
		this.saldo -= valor;
		} else {
			System.out.println("Não é possível efetuar saque, valor solicitado maior que o disponível");
		}
	}
	
	public void depositar(double valor) {
		if(valor > 0 ) {
			System.out.println("Depositou: " + valor);	
			this.saldo += valor;
		}	
	}
	
	@Override
	public String toString(){
		return "Nome do Cliente: " + getNomeCliente() +
		"\nNúmero da Conta: " + getNumConta() + 
	    "\nSaldo disponível: " + getSaldo() + "\n";
	}
	

}
