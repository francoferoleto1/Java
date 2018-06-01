package Producto;

import java.util.Scanner;

public class Venta {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int cantidad;

		Producto prod1 = new Producto("Alfajor", "aguila", 20, 15);
		Producto prod2 = new Producto("Alfajor", "oreo", 20, 0);

		System.out.println("Escriba cuantos prod quiere comprar: ");
		cantidad = sc.nextInt();

		// primero debería verificar si hay stock
		if (prod1.getStock() >= cantidad) {
			System.out.println("Usted ha vendido " + cantidad + " " + prod1.getNombre());
			prod1.setStock(prod1.getStock() - cantidad);
			System.out.println("El stock es: " + prod1.getStock());
		}else {
			System.out.println("El stock no es suficiente.");
			System.out.println("Solo nos quedan: " + prod1.getStock());
		}
		// luego si hay stock deberíamos bajar el stock igual cantidad
		// de ventas realizadas

	}
}