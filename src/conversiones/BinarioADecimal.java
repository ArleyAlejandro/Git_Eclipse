package conversiones;


import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número binario
        System.out.print("Ingrese un número binario: ");
        String numeroBinario = scanner.next();

        // Llamar a la función de conversión y mostrar el resultado
        int decimal = convertirBinarioADecimal(numeroBinario);
        System.out.println("El número decimal equivalente es: " + decimal);

        System.out.println("Esta será la nueva funcionalidad");
        
        scanner.close();
    }

    // Función para convertir binario a decimal
    public static int convertirBinarioADecimal(String binario) {
        int decimal = 0;
        int longitud = binario.length();

        for (int i = 0; i < longitud; i++) {
            char digito = binario.charAt(i);
            int valorDigito = Character.getNumericValue(digito);

            // Añadir el valor del dígito multiplicado por 2 elevado a la potencia correspondiente
            decimal += valorDigito * Math.pow(2, longitud - i - 1);
        }

        return decimal;
        
      
    }
}
