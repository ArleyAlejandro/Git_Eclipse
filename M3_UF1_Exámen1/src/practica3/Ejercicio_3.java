package practica3;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
	 
      	 //demanar dades
      	 int mes;
      	 do {
      		 System.out.print("Introdueix el mes (1-12): ");
      		 mes = entrada.nextInt();
      		 if (mes<1 || mes > 12) System.err.println("Mes invàlid!");
      	 } while (mes<1 || mes > 12);
      	 
      	 int dia;
      	 
      	 do {
      		 System.out.print("Introdueix el dia (1-31): ");
      		 dia = entrada.nextInt();
      		 if (dia<1 || dia > 31) System.err.println("Mes invàlid!");
      	 } while (dia<1 || dia > 12);
      	 
      	 // trobar trimestre
      	 
      	 String trimestre;
      	 
      	 if (mes >=9 && mes <=11)
      		 trimestre = "1r trimestre";
      	 else if ((mes == 12) || (mes <= 2) || (mes == 3 && dia <= 10))
      		 trimestre = "2n trimestre";
      	 else if ((mes==3 && dia >10 ) || (mes >= 4 && mes <= 6 ))
      		 trimestre = "3r trimestre";
      	 else
      		 trimestre = "vacances";
      	 
      	 System.out.printf("El %d/%d pertany al %s%n", dia, mes, trimestre);
      	 System.out.println("El " + dia + "/" + mes + " pertany al " + trimestre);
      	 
      	 

        entrada.close();
    }
}
