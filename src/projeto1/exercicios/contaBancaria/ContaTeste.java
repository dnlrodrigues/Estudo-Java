package projeto1.exercicios.contaBancaria;

public class ContaTeste {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca("Daniela", 1223, 1.2);
		System.out.println(cp);
		cp.sacar(100);
		cp.calcularNovoSaldo();
		System.out.println(cp);
		cp.depositar(100);
		cp.calcularNovoSaldo();
		System.out.println(cp);
		
		ContaEspecial ce = new ContaEspecial("Daniela F", 1224, 300);
		System.out.println(cp);
		ce.sacar(100);
		System.out.println(cp);
		ce.depositar(100);
		System.out.println(cp);

	}

}
