package projeto1.exercicios;

import javax.swing.JOptionPane;

public class EscolaTeste {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
						
		curso.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
		curso.setHorario(JOptionPane.showInputDialog("Digite o horário do curso"));
		
		Professor professor1 = new Professor();
		professor1.setNome(JOptionPane.showInputDialog("Digite o nome do Professor:"));
		professor1.setEmail(JOptionPane.showInputDialog("Digite o e-mail do professor: "));
		professor1.setDepartamento(JOptionPane.showInputDialog("Digite o departamento do professor: "));
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i <alunos.length; i++) {
			
			Aluno aluno = new Aluno();	
			aluno.setNome(JOptionPane.showInputDialog("Digite o nome do Aluno: "));
			aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matrícula do aluno: ")));
			double[] notas = new double[4];
			for (int j = 0; j < notas.length; j++) {
				notas[j] =(Double.parseDouble(JOptionPane.showInputDialog("Digite as notas: ")));
			}
			aluno.setNotas(notas);
			
			alunos[i] = aluno;
		}
		
		curso.setAlunos(alunos);
		
		curso.setProfessor(professor1);
		
		System.out.println(curso);		
		System.out.println(professor1);
		
		System.out.println(curso.imprimirAlunos());
		
		
		
		
		
		
		
		
		
		
		
	}

}
