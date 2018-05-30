package ultimoUni;

import java.util.Scanner;

public class Es_el_ult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = { 5, 8, 9, 7, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Que nota queres saber?");
		int lanota = sc.nextInt();

		System.out.println("Tu nota es: " + notas[lanota - 1]);

	}

}
