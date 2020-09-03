package entities;

public class Vendedor extends Empleado {
	private double porcenComision;
	private double totalVentas;
	
	public double getPorcenComision() {
		return porcenComision;
	}
	public void setPorcenComision(double porcenComision) {
		this.porcenComision = porcenComision;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(double totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	@Override
	public String getDefClase() {
		return "Vendedor";
	}
	 
	public Vendedor() {
		this.setPorcenComision(0);
		this.setTotalVentas(0);
	}
	
	public double getSueldo() {
		return (this.getSueldoBase() + ((this.getPorcenComision() * this.getTotalVentas()) / 100));
	}
}