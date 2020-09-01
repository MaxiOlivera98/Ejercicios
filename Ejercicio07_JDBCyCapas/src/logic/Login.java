package logic;

import java.util.LinkedList;
import java.util.ArrayList;

import data.*;
import entities.*;

public class Login {
	private DataPersona dp;
	private DataRol dr;
	
	public Login() {
		dp = new DataPersona();
		dr = new DataRol();
	}
	
	public Persona validate(Persona p) {
		/* para hacer m�s seguro el manejo de passwords este ser�a un lugar 
		 * adecuado para generar un hash de la password utilizando un cifrado
		 * asim�trico como sha256 y utilizar el hash en lugar de la password en plano 
		 */
		return dp.getByUser(p);
	}

	public LinkedList<Persona> getAll() {
		return dp.getAll();
	}

	public Persona getByDocumento(Persona per) {
		return dp.getByDocumento(per);
	}
	
	public ArrayList<Persona> getByApellido(Persona per) {
		return dp.getByApellido(per);
	}
	
	public Persona addPersona(Persona per) {
		return dp.add(per);
	}
	
	public LinkedList<Rol> getAllRoles(){
		return dr.getAll();
	}
	
	public Rol getRolById(Rol rol) {
		return dr.getById(rol);
	}
	
	public Persona edit(Persona per) {
		return dp.edit(per);
	}
	
	public Persona delete(Persona per) {
		return dp.delete(per);
	}
}