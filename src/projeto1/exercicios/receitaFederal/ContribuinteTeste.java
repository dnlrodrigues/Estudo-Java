package projeto1.exercicios.receitaFederal;

import javax.swing.JOptionPane;

public class ContribuinteTeste {

	public static void main(String[] args) throws Exception {		
		
		ContribuinteCPF[] contribuintesCPF = new ContribuinteCPF[3];
		ContribuinteCNPJ[] contribuintesCNPJ = new ContribuinteCNPJ[3];
		GravaLog gravaLog = new GravaLog();
		
		/*
		 * Criar contribuinte
		 */
		
		int j = 0;
		int k = 0;
		
		for (int i = 0; i < 6; i++) {
			
			String tipoContribuinte = JOptionPane.showInputDialog("Contribuinte é CPF ou CNPJ?");
			
			if ("cpf".equalsIgnoreCase(tipoContribuinte)) {//equalsIgnoreCase(não valida maiusculo e minusculo)
					
					ContribuinteCPF contribCPF = new ContribuinteCPF(tipoContribuinte.toUpperCase());//toUpperCase(maiusculo)
					contribuintesCPF[j] = contribCPF;
					j++;
					
			} else if ("cnpj".equalsIgnoreCase(tipoContribuinte)) {
					
					ContribuinteCNPJ contribCNPJ = new ContribuinteCNPJ(tipoContribuinte.toUpperCase());//toUpperCase(maiusculo)
					contribuintesCNPJ[k] = contribCNPJ;
					k++;
				
			} else {
				JOptionPane.showMessageDialog(null, "Tipo de Contribuinte inválido!");
			}
			
		}
				
		/*
		 * Calcular imposto e imprimir
		 */
		
		for (ContribuinteCPF contribuinteCPF : contribuintesCPF) {
			try {
				contribuinteCPF.calcularImpostoCPF();
				System.out.println(contribuinteCPF.toString());
			} catch (Exception e){
				gravaLog.gravarLog(e);
			}
		}
		
		for (ContribuinteCNPJ contribuinteCNPJ : contribuintesCNPJ) {
			try {
				contribuinteCNPJ.calcularImpostoCNPJ();
				System.out.println(contribuinteCNPJ.toString());
			} catch (Exception e) {
				gravaLog.gravarLog(e);
			}
		}
		
	}

}
