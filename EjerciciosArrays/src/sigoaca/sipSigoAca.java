package sigoaca;

import java.util.Scanner;

public class sipSigoAca {

	public static void main(String[] args) {
		double [] notas = new double [3]; 
		double promedio = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese sus calificaciones: ");
		
		for(int not=0;not<notas.length;not++) {
			notas[not]= sc.nextDouble();
		}// Cargo el vector
			
		
		for (int j= 0;j<notas.length;j++) {
			promedio+=((notas[j])/notas.length);
		
		}
	
		 System.out.println("Tu promedio es: "+promedio);
		
		
		
		
		
		
	}// Aca termina el metodo main

}// Aca termina la clase
