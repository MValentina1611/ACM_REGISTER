package model;

import java.util.ArrayList;
import java.util.Collection;

public class Maraton {

	private int numProgramadores;
	private Programador programadorRaiz;
	
	public Maraton()
	{}
	
	public void agregarProgramador(String nombre, String telefono, String direccion)
	{}
	
	public void eliminarProgramador(String nombre)
	{}
	
	public Programador buscarProgramador(String nombre)
	{
		Programador prog = new Programador("","","","");
		return prog;
	}
	
	public Collection darListaProgramadores()
	{
		Collection collection = new ArrayList();
		return collection;
	}
	
	
}
