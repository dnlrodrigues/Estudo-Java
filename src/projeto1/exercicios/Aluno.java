package projeto1.exercicios;

public class Aluno {
	
	private String nome;
	private int matricula;
	private double[] notas= new double[4];
	private double media;
	private static double mediaTurma = 0;
	

	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public void setNotas(double[] notasArray) {
		this.notas = notasArray;
	}
	
	public double media() {
		media = (notas[0] + notas[1] + notas[2] + notas[3])/4;
		mediaTurma += media;
		return media;
	}
	
	
	public String imprimeAlunos() {
		String imprimirAluno = "\nNome do Aluno: " + nome +
								"\nMatricula: " + matricula +
								"\nNotas: " + notas[0] + " - " + notas[1] + " - "
								+ notas[2] + " - " + notas[3] + " - " +
								"\nA média do aluno " + nome + " é " + media() + ".\n"
								+ aprovado();
		return imprimirAluno;
	}
	
	public String aprovado() {
		if (this.media >= 7 ) {
			return "O aluno está aprovado!";
		} else {
		    return "O aluno está reprovado!";
		}
	}
	
	public String imprimirMediaTotal() {
		return "\nA média da turma foi: " + mediaTurma/5;
	}
	
	
	
	
		
}
