package ui;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Enunciados -- Ejercicio 02");
		Scanner lector = new Scanner(System.in);
		
		iterar(lector);
		lector.close();
	}

	private static void iterar(Scanner lector) {
		
		String[] palabras = new String[10];
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Ingrese la palabra " + (i+1) + ": ");
			palabras[i]=lector.nextLine();
		}
		
		System.out.println();
		
		System.out.println("Palabras ingresadas en orden inverso");
		for (int i = palabras.length-1; i >=0; i--) System.out.println("\tpalabras[" + i + "]: " + palabras[i]);
	}
}