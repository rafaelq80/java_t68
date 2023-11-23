package aula_exceptions;

public class ExcecaoSimples extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcecaoSimples() {}
	
	public ExcecaoSimples(String message) {
		super(message);
	}
	
}
