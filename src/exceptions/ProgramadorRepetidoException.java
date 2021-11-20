package exceptions;

public class ProgramadorRepetidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;

	public ProgramadorRepetidoException(String nombre)
	{
		super("There is already a programmer named " + nombre );	
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
