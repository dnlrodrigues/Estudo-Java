package projeto1.exercicios.receitaFederal;

import java.text.DecimalFormat;

public abstract class Contribuinte {
	
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	private String nomeContribuinte;
	private String tipoContribuinte;
	private double rendaBruta, imposto, aliquota,parcDeduzir;
	protected Boolean liberado = true;
	
	public double getParcDeduzir() {
		return parcDeduzir;
	}

	protected void setParcDeduzir(double parcDeduzir) {
		this.parcDeduzir = parcDeduzir;
	}

	public String getNomeContribuinte() {
		return nomeContribuinte;
	}
	
	public void setNomeContribuinte(String nomeContribuinte) {
		this.nomeContribuinte = nomeContribuinte;
	}
	
	public String getTipoContribuinte() {
		return tipoContribuinte;
	}
	
	public void setTipoContribuinte(String tipoContribuinte) {
		this.tipoContribuinte = tipoContribuinte;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public double getImposto() {
		return imposto;
	}
	
	public double getAliquota() {
		return aliquota;
	}
	
	protected void setAliquota(double aliquota) {
		this.aliquota = aliquota/100;
	}
	
	protected double calcularImposto() {
			imposto = (rendaBruta-parcDeduzir) * aliquota;
			return imposto;
	}
	
	@Override
	public String toString() {
		String imprimirContribuinte;
		
		if(liberado) {
		DecimalFormat dfAliquota = new DecimalFormat("##%");
		imprimirContribuinte = "Nome do contribuinte: " + nomeContribuinte;
	    imprimirContribuinte+= "\nTipo do contribuinte: " + tipoContribuinte +  
									  "\nRenda Bruta do contribuinte: " + rendaBruta +
									  "\nAlíquota aplicada: " + dfAliquota.format(getAliquota()) + 
									  "\nValor do imposto a ser deduzido: R$ " + imposto + "\n";
		} else {
			imprimirContribuinte = "Não foi possível cálcular imposto, cadastro de contribuinte inválido!\n";
		}
		return imprimirContribuinte;
	}

}
