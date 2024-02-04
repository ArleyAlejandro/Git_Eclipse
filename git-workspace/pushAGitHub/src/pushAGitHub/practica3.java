package practica3;
import java.io.*;

public class practica3 {

	public static void main(String[] args) throws Exception{
	
		BufferedReader entrada = new BufferedReader(
	            new InputStreamReader(System.in));
   /*
	//EJERCICIO 1
	
	//PIDO LOS DATOS NECESARIOS AL USUARIO
	System.out.println("Introduzca la cantidad de alumnos de DAW: ");
	int DAW = Integer.parseInt(entrada.readLine());

	System.out.println("Introduzca la cantidad de alumnos de ASIX: ");
	int ASIX = Integer.parseInt(entrada.readLine());
	
	//los alumnos de DASG1 son un tercio de los alumnos totales
	
	int alumnosTotales= DAW+ASIX;
	
	//CALCULO LOS ALUMNOS DEL PRIMER GRUPO
	int DASG1= alumnosTotales/3;

	//CALCULO LOS ALUMNOS DEL 2NDO GRUPO
	int DASG2= (alumnosTotales-DASG1)/2;
	
	int DASG3= alumnosTotales-DASG1-DASG2;
	
	if (DASG1<=20 || DASG1<=20 || DASG1<=20) {
	System.out.printf("DASG1: %d alumnos\n",DASG1);
	System.out.printf("DASG2: %d alumnos\n",DASG2);
	System.out.printf("DASG3: %d alumnos\n",DASG3);
	}
	

	else if (DASG1>20 || DASG1>20 || DASG1>20) {
		System.out.printf("DASG1: %d alumnos <--Atención, problema de espacio!\n",DASG1);
		System.out.printf("DASG1: %d alumnos <--Atención, problema de espacio!\n",DASG2);
		System.out.printf("DASG1: %d alumnos <--Atención, problema de espacio!\n",DASG3);
	}
	else {	
	}
	
	//EJERCICIO 2		
	
	//saco el enunciado por panatalla y pido al usuario que entre una frase 
	System.out.println("Introduzca una frase : ");
	String frase = String.parseString(entrada.readLine());
	
	//hago un bucle para que se repita 5 veces la salida del programa
	for (int i=1;i<=5;i++) {
		frase++;
		System.out.println("Has dicho: " + frase);	
}
	
	*/
	//EJERCICIO 3 

	System.out.println("Introduzca el mes (1-12) : ");
	int mes=Integer.parseInt(entrada.readLine());
	
	
	while(mes<1 || mes>13) {
		System.out.println("Mes inválido! Introduzca el mes (1-12)");
		mes=Integer.parseInt(entrada.readLine());
	}
	 
	System.out.println("Introduzca el dia (1-31) : ");
	int dia=Integer.parseInt(entrada.readLine());


	while(dia<1 || dia>31) {
		System.out.println("Mes inválido! Introduzca el mes (1-12)");
		dia=Integer.parseInt(entrada.readLine());
	}
	int trimestre;
	
	if (mes>=9 || mes<=11) {
		trimestre =1;
		System.out.printf("El %d/%d pertenece al semestre %dn ",dia,mes,trimestre);
	}
	else if (mes==12 || mes<=5) {
		trimestre =2;
		System.out.printf("El %d/%d pertenece al semestre %dn ",dia,mes,trimestre);
	}
	else {
		trimestre =3;
		System.out.printf("El %d/%d pertenece al semestre  %dn ",dia,mes,trimestre);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
