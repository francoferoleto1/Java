package Clase10;

public class Clase10 {
	
	static int dim=10; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] vec = new int [dim];
		cargoVector(vec);
		
		for (int i = 0; i < dim; i++) {
			System.out.print(vec[i] + " ");
		}
		
}// Aca termina el metodo main
	
	static void cargoVector(int[] vec) {
		for (int i=0;i<dim;i++) {
			vec[i]=(int)(Math.random()*100);
		}
		
	}// Aca termina el metodo cargoVector
	
}// Aca termina la clase10
