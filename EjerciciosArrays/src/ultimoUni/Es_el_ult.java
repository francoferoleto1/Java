package ultimoUni;

import java.util.Scanner;

public class Es_el_ult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = { 5, 8, 9, 7, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Que nota queres saber?");
		int lanota = sc.nextInt();
		
		switch (lanota) {
		 case 1 : System.out.println("Tu nota es: "+ notas[0]);
		 	break;
		 case 2 : System.out.println("Tu nota es: "+ notas[1]);
		 	break;
		 case 3 : System.out.println("Tu nota es: "+ notas[2]);	
		 	break;
		 case 4 : System.out.println("Tu nota es: "+ notas[3]);	
		 	break;
		 case 5 : System.out.println("Tu nota es: "+ notas[4]);
		 	break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
