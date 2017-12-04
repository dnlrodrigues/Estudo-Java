package projeto1.exercicios;


public class Curso {

	private String nome;
	private String horario;
	
	private Professor professor = new Professor();
	private Aluno[] alunos;
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString(){
		return "Nome do curso: " + nome + "\nHorário do curso: " + horario + "\n";
	}
	
	public String imprimirAlunos() {
		String imprimir="";
		if (alunos != null) {
			for (Aluno aluno : alunos) {
				imprimir += aluno.imprimeAlunos() + "\n";
				if(aluno == alunos[alunos.length-1]) {
					imprimir+= aluno.imprimirMediaTotal();
				}
			}
		} else {
			return "Aluno(s) inválido";
		}
		return imprimir;
	}

}
