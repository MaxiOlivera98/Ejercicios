package ui;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Enunciados -- Ejercicio 01");
		int i;
		System.out.println();
		
		System.out.println("Primeros 10 nros enteros: ");
		for (i = 1; i <= 10; i++) System.out.print("\t" + i);
		System.out.println();
		
		System.out.println("Primeros 10 nros impares: ");
		for (i = 1; i <= 19; i = i + 2) System.out.print("\t" + i);
		System.out.println();
	}
}