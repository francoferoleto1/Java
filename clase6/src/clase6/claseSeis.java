package clase6;

import java.util.Scanner;

public class claseSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Diagramas de flujo
		// UML es un lenguaje unificado 
		// Sirve para que todos entiendan el codigo sin importar el lenguaje que utilizen
		
		double prome=0;
		double [] var = new double[9] ;
		var[0] = 9;
		System.out.println(var[0]);
		
		Scanner sc = new Scanner(System.in);
		
		for (int n= 0;n<var.length;n++) {
			System.out.println("Dame una nota");
			var[n]=sc.nextInt();
		} // Esta es la forma de cargar el vector
		for (int j= 0;j<var.length;j++) {
			
			System.out.print(var[j]+" ");
			prome+=((var[j])/var.length);
			
		}		/////////////////
		System.out.println(" ");	
		System.out.println(prome);
		// Esta es la forma de mostrar un vector
		
		
	}

}
