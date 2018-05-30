package ejercicioDeHoy;

import java.util.Scanner;

public class vectores {

	public static void main(String[] args) {
		String[] names = new String[3];

		int[] times = new int[names.length];

		cargoCorredores(names);

		cargoTiempos(times);

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}

		calculoElMasRapido(times, names);

	}

	static void cargoCorredores(String[] names) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("Por favor ingrese el nombre del corredor " + (i + 1));
			names[i] = sc.nextLine();
		}
	}

	static void cargoTiempos(int[] times) {
		// cosas con Math.random();
		for (int i = 0; i < times.length; i++) {
			times[i] = (int) (Math.random() * 100);
		}
	}

	static void calculoElMasRapido(int[] times, String[] names) {
		// mas cosas
		int menor = times[0];
		int pos = 0;
		int aux = 0;

		for (int i = 0; i < times.length; i++) {
			if (menor >= times[i]) {
				menor = times[i];
				aux = pos;
				pos = i;
			} // estructura para calcular el más rapido
		}

		// imprimo el mas rapido
		System.out.println("El corredor " + names[pos] + " mas rapido con un tiempo de: " + times[pos]);
		System.out.println("El segundo corredor mas rapido fue " + names[aux] + " con un tiempo de: " + times[aux]);
	}
}// Aca termina la clase