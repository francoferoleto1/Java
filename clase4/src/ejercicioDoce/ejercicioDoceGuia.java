package ejercicioDoce;

public class ejercicioDoceGuia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		do {
			System.out.print(c + " ");
			c++;
		}while (c<101);
		//Este es el bucle mientras
		//Aca la maquina se fija que el numero no exceda la condicion
		//En While solo, la maquina directamente ejecuta					 
		int num = 0;
		int contar = 0;
		do {
			if (num%2!=0){
				contar++;
			}
			num++;
		} while (num<101);
		System.out.println(" ");
		System.out.println("Hay "+ contar + " impares");
		int numeros = 0;
		int cuenta = 0;
		do {
			if (numeros%2==0){
				cuenta++;
			}	
			numeros++;
		} while (numeros<101);
		System.out.println("Hay "+ cuenta + " pares" );
	}

}
//int suma = 0;
		//int v = 0;		
		//do {
		//	suma+=v;
		//	v++;	
		//} while (v<101);
		//System.out.println(" ");
		//System.out.println("La suma es: "+suma);