package TercerClase;

public class ejercicioTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 1;
		
		do {
			System.out.print(c + " ");
			c++;
		}while (c<101);
		
		int x = 100;
		
		do {
			System.out.print(x + " ");
			x--;
			
		} while (x>=1);
		//Este es el bucle mientras
		//Aca la maquina se fija que el numero no exceda la condicion
		//En While solo, la maquina directamente ejecuta	
		
		
		// 
		int suma = 0;
		int v = 0;
		
		do {
			suma+=v;
			v++;
			
		} while (v<101);
		System.out.println(" ");
		System.out.println("La suma es: "+suma);
		
	    
		
		int num = 0;
		int contar = 0;
		
		do {
			if (num%2!=0){
				System.out.println("El numero "+ num + " es impar");
				contar++;
			}
			
			num++;
			
		} while (num<101);
		
		System.out.println("Hay "+ contar + " impares");
		
			
			
		
		
		
		
	}// aca termina el metodo main

}// aca termina la clase 3 

