package ScannerExample;

import java.util.Scanner;

public class PrimerEjercicio {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese el segundo número");
        int segundoNumero = scanner.nextInt();

        System.out.println("La suma de a + b es igual a " + (primerNumero+segundoNumero));

        if (primerNumero>segundoNumero) {
            System.out.println(" El primer número es mayor que el segundo");
        }else {
            System.out.println("El segundo número es mayor que el primero");
        }
        System.out.println("Fin de la aplicación");

        scanner.close();


    }
}
