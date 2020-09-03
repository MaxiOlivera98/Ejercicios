package entities;

public abstract class Empleado {
	
	private int dni;
	private String apellido;
	private String nombre;
	private String email;
	private double sueldoBase;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public abstract String getDefClase();
	
	public Empleado() {
		this.setDni(0);
		this.setApellido("");
		this.setNombre("");
		this.setEmail("");
		this.setSueldoBase(0);
	}
	
	public abstract double getSueldo();
}