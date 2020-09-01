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
		int n;
		Integer[] numeros = new Integer[20];
		Integer[] nros = new Integer[20];
		
		System.out.print("Ingrese el nro inicial: ");
		n = Integer.parseInt(lector.nextLine());
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Ingrese el nro " + (i+1) + ": ");
			numeros[i]= Integer.parseInt(lector.nextLine());
		}
		System.out.println();
		
		int j = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > n) {
				nros[j] = numeros[i];
				j++;
			}
		}
		System.out.println();
		
		System.out.println("Nros mayores al nro inicial " + n + ":");
		for (int i = 0; i < j; i++) {
			System.out.print(nros[i]);
		}
	}
}