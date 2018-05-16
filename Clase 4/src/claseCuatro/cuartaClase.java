package claseCuatro;

import java.util.Scanner;

public class cuartaClase {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
		//La POO se utiliza para proyectos grandes porque esta mejor organizada
		//y es mas facil de reutilizar el codigo
		// La estructurada es un codigo largo e unico por lo que es mas conveniente
		// utilizarla para proyectos chicos
		//   
		
		
		
		
		// TIPOS DE VARIABLES
		// Usamos la que mas nos conviene en relacion a la memoria que ocupa la variable
		// dependiendo el valor que le queremos dar a la variable
		// Hay variables que son primitivas como int, bootlean, char
		
		
		
		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ingrese un entero:");
		int num = 0;
		num = sc.nextInt();
		System.out.println("Ingrese una cadena de caracteres:");
		String cadena;
		cadena = sc1.nextLine();
		System.out.println("Ingrese un numero con coma:");
		double racional = 0;
		racional = sc2.nextDouble();
		System.out.println("El entero es: "+num);
		System.out.println("La cadena de caracteres es: "+cadena);
		System.out.println("El racional es: "+racional);
		
		
		
	}

}
