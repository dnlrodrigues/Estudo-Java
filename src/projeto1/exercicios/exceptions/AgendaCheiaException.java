package projeto1.exercicios.exceptions;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		return "N�o h� mais espa�o dispon�vel na agenda para adicionar contato(s)";
	}
}
