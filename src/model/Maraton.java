package model;


import java.util.ArrayList;
import java.util.Collection;

import exceptions.ProgramadorRepetidoException;

public class Maraton {

	//private int numProgramadores;
	private Programador programadorRaiz;
	
	public Maraton()
	{}
	
	
	//----------------------Métodos utilizados-------------------------
	
	//AGREGAR
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) throws ProgramadorRepetidoException
	{
		Programador toAdd = new Programador(nombre, telefono, direccion, eMail);
		if( programadorRaiz == null)
		{
			programadorRaiz = toAdd;
		}
		else
		{
			agregarProgramador(toAdd, programadorRaiz );
		}
	}
	
	public void agregarProgramador(Programador newP, Programador current ) throws ProgramadorRepetidoException
	{
		//Buscar antes si ya existe un programador con este nombre si existe llamamos a la exception, si no, se agrega al árbol 
		if( buscarProgramador(newP) == null)
		{
			if( newP.compareTo(current) < 0 ) 
			{
				if(current.getIzq() != null) 
				{
					agregarProgramador(newP,current.getIzq());
				} 
				else 
				{
					current.setIzq(newP);
				}
			}
			else if( newP.compareTo(current) >= 0)
			{		
				if(current.getDer() != null) 
				{
					agregarProgramador(newP, current.getDer());
				} 
				else 
				{
					current.setDer(newP);
				}
			}
		}
		else
		{
			throw new ProgramadorRepetidoException(newP.darNombre());
		}
	}
	
	//BUSCAR
	//No deben haber programadores repetidos, se tomará el nombre como característica para diferenciarlos
	public Programador buscarProgramador(Programador newP)
	{
		if(programadorRaiz == null)
		{
			return null;
		}
		else
		{
			return buscarProgramador(programadorRaiz, newP);
		}

	}
	
	public Programador buscarProgramador(Programador current, Programador newP)
	{
		if( current == null)
		{
			return current;
		}
		else if(current.darNombre().equalsIgnoreCase(newP.darNombre()) )
		{
			return current;
		}
		else if( newP.compareTo(current) >= 0 )
		{
			return buscarProgramador(current.getDer(), newP);
		}
		else
		{
			return buscarProgramador(current.getIzq(), newP);
		}
		
	}
	
	/*LISTA CON NOMBRES
	 * Retornar colección con los nombres de los programadores registrados, ordenada alfabéticamente de forma ascendente.
	 * El método debe pertenecer a esta clase y no a la clase Programador, ya que esta clase es la que maneja el ABB
	 * No puede ser void porque debe retornar la Coleccion que en este caso es un ArrayList
	 * Se necesita un programador como parámetro para poder llamar el método de forma recursiva .
	 * */
	public ArrayList<String> inorden( ArrayList<String> acumulado, Programador agregar )
	{
		if( agregar != null)
		{
			inorden(acumulado, agregar.getIzq());
			acumulado.add( agregar.darNombre());
			inorden(acumulado, agregar.getDer());
		}
		return acumulado;
		
	}	
	
	/*
	  ALTURA
	  Este método debe ser responsabilidad de la esta clase (Maraton) y no de la clase Programador
	  Obtener la altura del ABB:
		- Altura = Niveles + 1
		- Estrategia:
		 	- Recorrer el ABB por cada lado.
		 	- Sumar 1 cada vez que se encuentre un nodo distinto de null.
			- Sumarle 1 al mayor.
	*/

	public int darAltura( Programador aux )
	{
		if(aux != null)
		{
			int alturaIzq = darAltura(aux.getIzq());
			int alturaDer = darAltura(aux.getDer());
			
			return 1 + Math.max( alturaIzq, alturaDer);
		}
		
		return 0;
	}
	
	//--------------------FIRMA DE LOS MÉTODOS RESTANTES EN EL DIAGRAMA-------------------------------------------
	
	
	public Collection<Programador> darListaProgramadores()
	{
		return null;
	}
	
	public void eliminarProgramador(String nombre)
	{}



	public Programador getProgramadorRaiz() {
		return programadorRaiz;
	}

	
	

	
	
}
