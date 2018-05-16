package ejercicioTresGuia;

public class ejercicioGuia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros = 0;
		int cuenta = 0;
		do { if (numeros%2==0){
				cuenta++;
			}	
			numeros++;
		} while (numeros<101);
		System.out.println("Hay "+ cuenta + " pares" );
	}//aca termina el metodo main

}// aca termina la clase
