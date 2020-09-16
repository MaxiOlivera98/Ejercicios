package ui;

import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Enunciados -- Ejercicio 04");
		Scanner lector = new Scanner(System.in);
		iterar(lector);
		lector.close();
	}

	private static void iterar(Scanner lector) {
		int n, n1;
		ArrayList<Integer> nros = new ArrayList<>();
		
		System.out.print("Ingrese el nro inicial: ");
		n = Integer.parseInt(lector.nextLine());
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print("Ingrese el nro " + (i+1) + ": ");
			n1 = Integer.parseInt(lector.nextLine());
			if (n1 > n) nros.add(n1);
		}
		System.out.println();
		
		System.out.println("Nros mayores al nro inicial " + n + ":");
		for(Integer num : nros) {
			System.out.print(num);
			System.out.print(", ");
		}
	}
}