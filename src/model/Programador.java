package model;

import java.util.Collection;

public class Programador {

	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	public Programador( String nombre, String telefono, String direccion, String eMail)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
	
	public int compareTo(Object toCompare)
	{
		return 0;
	}
	
	public String darNombre()
	{
		return "";
	}
	
	public String darTelefono()
	{
		return "";
	}
	
	public String darEmail()
	{
		return "";
	}
	
	public boolean esHoja()
	{
		return true;
	}
	
	public Programador darMenor()
	{
		Programador prog = new Programador("","","","");
		return prog;
	}
	
	public Programador darMayor()
	{
		Programador prog = new Programador("","","","");
		return prog;
	}
	
	public int darAltura()
	{
		return 0;
	}
	
	public int darPeso()
	{
		return 0;
	}
	
	public void insertar(Programador toInsert)
	{}
	
	public void buscar(String nombre)
	{}
	
	public void eliminar(String nombre)
	{}
	
	public void inorden(Collection collection)
	{}
	
	
}
