package entities;

public class Administrativo extends Empleado{
	private int hsExtra;
	private int hsMes;
	
	public int getHsExtra() {
		return hsExtra;
	}
	public void setHsExtra(int hsExtra) {
		this.hsExtra = hsExtra;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	@Override
	public String getDefClase() {
		return "Administrativo";
	}
	
	public Administrativo() {
		this.setHsMes(0);
		this.setHsExtra(0);
	}
	
	public double getSueldo() {
		return (this.getSueldoBase() * ((this.getHsExtra() * 1.5) + this.getHsMes()) / this.getHsMes());
	}
}