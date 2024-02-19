package conversiones;


import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario ingresar un número binario
        System.out.print("Ingrese un número binario: ");
        String numeroBinario = scanner.next();

        // Llamar a la función de conversión y mostrar el resultado
        String hexadecimal = convertirBinarioAHexadecimal(numeroBinario);
        System.out.println("El número hexadecimal equivalente es: " + hexadecimal);

        scanner.close();
    }

    // Función para convertir binario a hexadecimal
    public static String convertirBinarioAHexadecimal(String binario) {
        // Asegurarse de que la longitud del binario sea un múltiplo de 4 para facilitar la conversión
        while (binario.length() % 4 != 0) {
            binario = "0" + binario;
        }

        StringBuilder hexadecimal = new StringBuilder();
        int longitud = binario.length();

        // Iterar sobre bloques de 4 dígitos binarios y convertir a hexadecimal
        for (int i = 0; i < longitud; i += 4) {
            String bloqueCuatro = binario.substring(i, i + 4);
            int decimal = Integer.parseInt(bloqueCuatro, 2);
            char digitoHexadecimal = obtenerCaracterHexadecimal(decimal);
            hexadecimal.append(digitoHexadecimal);
        }

        return hexadecimal.toString();
    }

    // Función auxiliar para obtener el carácter hexadecimal correspondiente al valor decimal
    public static char obtenerCaracterHexadecimal(int decimal) {
        if (decimal >= 0 && decimal <= 9) {
            return (char) ('0' + decimal); // Dígitos del 0 al 9
        } else {
            return (char) ('A' + (decimal - 10)); // Letras A-F para valores de 10 a 15
        }
    }
}
