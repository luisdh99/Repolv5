package rv5;

import java.util.Scanner;

public class codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Añadir System.in para leer entrada
        
        // Solicitar el número al usuario
        System.out.print("Introduzca un número: ");
        String ni = s.nextLine();
        int c = Integer.parseInt(ni); // Convertir la cadena a un número entero
        
        int afo = 0;
        int noAfo = 0;
        int temp = c; // Variable temporal para hacer los cálculos sin perder el valor original

        // Ciclo para revisar cada dígito
        while (temp > 0) {
            int digito = temp % 10; // Obtener el último dígito
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++; // Incrementar si el dígito es afortunado
            } else {
                noAfo++; // Incrementar si no es afortunado
            }
            temp /= 10; // Eliminar el último dígito
        }

        // Comparar cantidades de dígitos afortunados y no afortunados
        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
        
        s.close(); // Cerrar el scanner
    }
}

	
