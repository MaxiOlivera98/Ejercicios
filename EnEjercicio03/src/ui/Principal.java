package ui;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Enunciados -- Ejercicio 03");
		Scanner lector = new Scanner(System.in);
		
		iterar(lector);
		lector.close();
	}

	private static void iterar(Scanner lector) {
		
		String[] palabras = new String[11];
		boolean encontrar = false;
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Ingrese la palabra " + (i+1) + ": ");
			palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		
		for (int i = 0; i < 10; i++) {
			if (palabras[i].equalsIgnoreCase(palabras[10])) encontrar = true;
		}
		
		if (encontrar) System.out.println("La palabra 11 ya fue ingresada entre las 10 primeras");
		else System.out.println("La palabra 11 no fue ingresada entre las 10 primeras");
	}
}
