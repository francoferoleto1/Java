package Ejercicio2;

import java.util.Scanner;

public class ejercicioDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		@SuppressWarnings("resource")
		Scanner var = new Scanner(System.in);
		// var es la variable que cree tipo objeto
		// System.in ingreso dato por consola
		// Java.util.Scanner donde vive Scanner
		numero = var.nextInt();
		// int porque tenes que poner un entero
		// si fuese un double seria nextDouble
		// si queremos ingresar un valor por teclado tenemos que usar el tipo de varieblbe objeto scanner +
		// el proceso consta de 2 partes primero crear la cariable tipo scanner usando el constructor+
		// luego utilizaremos junto a nuestra variable el metodo que nos permita ingresar el tipo+
		// de dato deseado.
		// Nota si el metodo utilizado es para ingresar un entero (nextInt)la variable donde alojaremos
		// lo ingresado debera ser del mismo tipo (int).
		if (numero % 2 == 0) {
			System.out.println("El " + numero + " es par");
		} else {
			System.out.println("El " + numero + " es impar");
		}
	}

}
