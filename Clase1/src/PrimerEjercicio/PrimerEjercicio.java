package PrimerEjercicio;

public class PrimerEjercicio {

	public static void main(String[] args) {
		 // aca empieza el metodo main
	    System.out.println("hola mundo");
	    System.err.println("Hola mundo");
		System.out.println('J');
		
		// Pseudo codigo no es codigo pero tiene una estructura logica similar
		// If 'HT' fue - 40 entonces 'HT'x 'VH' = Sueldo
		// sino 'HT'-40='HE'   entonces 'sueldo'=(40*200)+('HT'*300)
		
		 int HT = 47 ;
		  // HT es horas trabajadas
		 String nombreEmpleado = "Jorge";
		 char Sexo = 'M';
		 int VH = 200 ;
		   // VH es valor de hora
		 double MultHora = 1.5 ;
		 int sueldo = 0 ;
		 
		 //'<=' '>=' '==' '=` '!=' '&&' '||'  OPERADORES
		 
		 
		 if(HT <=40){ 
			 sueldo = HT * VH;
			
		 } else if (HT>60){ 
			 System.err.println("No puede trabajar mas "
			 		+ "de 60 horas semanales");
		 }
			 
			 
		 
		
	}// aca termina el metodo main
		
}// aca termina la clase	
		

	


