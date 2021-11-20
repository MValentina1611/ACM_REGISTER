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
		
		agregar("Juan", "002", "calle 24", "hola@gmail.com");
		agregar("Angela", "001", "calle 14", "holo@gmail.com");
		agregar("Juan", "000", "calle 15", "holu@gmail.com");
		agregar("Carlos", "000", "calle 15", "holu@gmail.com");
		
		System.out.println("-----------------Printing ABB...-------------------");
		print(maraton.getProgramadorRaiz());
		
		System.out.println("-----------------Printing Collection...-------------------");
		
		ArrayList<String> acumulado = new ArrayList<String>();
		printList( maraton.inorden(acumulado, maraton.getProgramadorRaiz()) , 0);
		
		//printList(maraton.inorden(acumulado, maraton.getProgramadorRaiz()));
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

	public static void printList(ArrayList<String> acumulado, int i)
	{
		if( i < acumulado.size() && acumulado.get(i) != null )
		{
			System.out.println(acumulado.get(i));
			i = i+1;
			printList(acumulado, i);
		}
		
	}
	
	public static void printList(ArrayList<String> acumulado)
	{
		for(int i = 0; i< acumulado.size();i++)
		{
			System.out.println(acumulado.get(i));
		}
	}
	
}
