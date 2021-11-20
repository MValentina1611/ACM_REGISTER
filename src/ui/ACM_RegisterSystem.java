package ui;

import exceptions.ProgramadorRepetidoException;
import model.Maraton;
import model.Programador;

public class ACM_RegisterSystem {
	
	private static Maraton maraton;
	
	public static void main(String[] args) 
	{
		maraton = new Maraton();
		agregar("Juan", "002", "calle 24", "hola@gmail.com");
		agregar("Angela", "001", "calle 14", "holo@gmail.com");
		agregar("Juan", "000", "calle 15", "holu@gmail.com");
		print(maraton.getProgramadorRaiz());
	}

	public static void agregar(String nombre, String telefono, String direccion, String eMail)
	{
		try 
		{
			maraton.agregarProgramador(nombre,telefono,direccion, eMail);
		} catch (ProgramadorRepetidoException e) 
		{
			System.err.println(e.getMessage());
		}
	}
	
	public static void print( Programador prog)
	{
		if( prog != null)
		{
			
			print (prog.getIzq());
			System.out.println(prog.toString());
			print (prog.getDer());
			
		}
	}
	
}
