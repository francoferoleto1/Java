package ejercicio;

import java.util.Scanner;

public class ejercicioClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Quiero ingresar una palabra por teclado y que me imprima la letra del medio	
		// Paso 1 contar cantidad de caracteres
		// Paso 2 dividir por 2 
		
		System.out.println("Ingrese una cadena de caracteres:");
		Scanner sc = new Scanner(System.in);
		String palabra;
		palabra = sc.nextLine();
		int caracteres = 0;
		caracteres = palabra.length();
		char c = palabra.charAt((caracteres/2)-1);
		if (c!=0) {
			System.out.println("La letra del medio es: "+c);
			
		} else System.out.println("La letra del medio es"+ (c+1));
		
		
		
		
		
		
	}

}
