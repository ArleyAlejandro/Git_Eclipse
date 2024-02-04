package practica3;
import java.util.Scanner;
public class Ejercicio_1 {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);

System.out.println("Introduzca la frase: ");
String frase=s.nextLine();

for(int i=0;i<5;i++) {
	System.out.printf("He dicho que '%s'!%n",frase);
}

s.close();
	}

}
