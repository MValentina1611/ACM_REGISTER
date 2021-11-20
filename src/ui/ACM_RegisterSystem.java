package ui;

import java.util.ArrayList;
import exceptions.ProgramadorRepetidoException;
import model.Maraton;
import model.Programador;

public class ACM_RegisterSystem {
	
	private static Maraton maraton;
	
	public static void main(String[] args) 
	{
		maraton = new Maraton();
		System.out.println("-----------------Adding Programmers...-------------------");
		
		agregar("Juan", "002", "calle 24", "juan@gmail.com");
		agregar("Angela", "001", "calle 14", "angela@gmail.com");
		agregar("Juan", "000", "calle 15", "juan2@gmail.com");
		agregar("Carlos", "003", "calle 16", "carlos@gmail.com");
		agregar("Andrea", "005", "calle 26", "andrea@gmail.com");
		agregar("Daniela", "006", "calle 66", "daniela@gmail.com");
		
		System.out.println("-----------------Printing ABB...-------------------");
		printInorder(maraton.getProgramadorRaiz());
		
		System.out.println("-----------------Printing Collection...-------------------");
		
		ArrayList<String> acumulado = new ArrayList<String>();
		printList( maraton.inorden(acumulado, maraton.getProgramadorRaiz()) , 0);
		
		System.out.println("-----------------Calculating the Height...-------------------");
		
		System.out.println("The height of the ACM Register ABB is " + maraton.darAltura(maraton.getProgramadorRaiz()));
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
	
	//Mostrar en inorder a los programadores registrados
	public static void printInorder( Programador prog)
	{
		if( prog != null)
		{	
			printInorder (prog.getIzq());
			System.out.println(prog.toString());
			printInorder (prog.getDer());	
		}
	}

	//Mostrar el contenido de la collection con los nombres de los programadores
	public static void printList(ArrayList<String> acumulado, int i)
	{
		if( i < acumulado.size() && acumulado.get(i) != null )
		{
			System.out.println(acumulado.get(i));
			i = i+1;
			printList(acumulado, i);
		}
		
	}
	
}
