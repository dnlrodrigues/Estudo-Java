package projeto1.exercicios.exceptions;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		return "Não há mais espaço disponível na agenda para adicionar contato(s)";
	}
}
