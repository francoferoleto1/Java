package ejercicioOcho;

import java.util.Scanner;

public class ejercicioOchoGuia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese una S o N: ");
		Scanner sc = new Scanner(System.in);
		String letra;
		letra = sc.nextLine();
		if (letra.equalsIgnoreCase("S")) {
			System.out.println("Esta bien");
		} else
			do {
				System.out.println("Una S o una N dije: ");
				letra = sc.nextLine();
			} while (!(letra.equalsIgnoreCase("S")));
		
		System.out.println("Salio!");

		// Scanner sc = new Scanner(System.in);
		// Sysout "ingresa algo"
		// char c = sc.next().charAt(0);
		// Sysout "Ingresaste: " + c

	}

}
