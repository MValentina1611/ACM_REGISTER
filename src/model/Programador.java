package model;

import java.util.Collection;

public class Programador {

	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	
	private Programador der;
	private Programador izq;
	
	//Builder
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
	
	//---------------Métodos utilizados -------------------
	
	
	public String darNombre() {
		return nombre;
	}
	
	//Sólo se compararán los nombres de los programadores
	public int compareTo(Programador toCompare)
	{
		return nombre.compareTo(toCompare.darNombre());
	}

	public String toString()
	{
		return "Name: "+ nombre+"\nPhone: " + telefono +"\nAddress: "+direccion+"\nE-Mail: "+ eMail+"\n";
	}
	
	//--------------------FIRMA DE LOS MÉTODOS RESTANTES EN EL DIAGRAMA-------------------------------------------
	public String darTelefono() {
		return telefono;
	}

	public String darDireccion() {
		return direccion;
	}

	public String dareMail() {
		return eMail;
	}
	
	public boolean esHoja()
	{
		return true;
	}
	
	public Programador darMenor()
	{
		return null;
	}
	
	public Programador darMayor()
	{
		return null;
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
	
	@SuppressWarnings("rawtypes")
	public void inorden(Collection collection)
	{}	
	
}
