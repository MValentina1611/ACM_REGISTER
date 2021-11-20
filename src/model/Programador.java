package model;

import java.util.Collection;

public class Programador {

	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	private Programador der;
	private Programador izq;
	
	public Programador( String nombre, String telefono, String direccion, String eMail)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
		
	//-----------------Getters and Setters--------------------
	
	public Programador getDer() {
		return der;
	}

	public Programador getIzq() {
		return izq;
	}

	public void setDer(Programador der) {
		this.der = der;
	}

	public void setIzq(Programador izq) {
		this.izq = izq;
	}	
	
	public String getNombre() {
		return nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public String geteMail() {
		return eMail;
	}

	//---------------Methods-------------------
	
	public int compareTo(Programador toCompare)
	{
		return nombre.compareTo(toCompare.getNombre());
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

	public String toString()
	{
		return "Name: "+ nombre+ "\n"+ "E-Mail: "+ eMail;
	}
	
	
}
