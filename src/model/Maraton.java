package model;


import java.util.ArrayList;
import java.util.Collection;

import exceptions.ProgramadorRepetidoException;

public class Maraton {

	//private int numProgramadores;
	private Programador programadorRaiz;
	
	public Maraton()
	{}
	
	
	
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
			throw new ProgramadorRepetidoException(newP.getNombre());
		}
	}
	
	
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
		else if(current.getNombre().equalsIgnoreCase(newP.getNombre()) )
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
	
	
	
	public Collection<Programador> darListaProgramadores()
	{
		return null;
	}
	
	public void eliminarProgramador(String nombre)
	{}



	public Programador getProgramadorRaiz() {
		return programadorRaiz;
	}

	
	
	public ArrayList<String> inorden( ArrayList<String> acumulado, Programador agregar )
	{
		if( agregar != null)
		{
			inorden(acumulado, agregar.getIzq());
			acumulado.add( agregar.getNombre());
			inorden(acumulado, agregar.getDer());
		}
		return acumulado;
		
	}
	
	
}
