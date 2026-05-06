package Ejercicios;

/* 1. Consultar saldo
   2. retirar dinero
   3. ingresar dinero
   4. Salir*/

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {

        int opcion;
        int saldo=1000;
        int retirada;
        int ingreso;
        String otraOperacion;

        Scanner scanner=new Scanner(System.in);

        do {

            System.out.println("Que quieres hacer?");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.println("El saldo de la cuenta es " + saldo);
            } else if (opcion == 2) {
                System.out.println("Cuánto dinero quieres retirar?");
                retirada = scanner.nextInt();
                System.out.println("El nuevo saldo es: " + (saldo=saldo-retirada));
            } else if (opcion == 3) {
                System.out.println("Cuánto dinero quieres ingresar?");
                ingreso = scanner.nextInt();
                System.out.println("El nuevo saldo es " + (saldo=saldo+ingreso));
            } else if (opcion == 4) {
                System.out.println("Programa finalizado");
            } else {
                System.out.println("Número incorrecto, ingrese otro número");
            }
            System.out.println("quieres hacer otra operación? SI/NO");
            otraOperacion= scanner.next();

        } while (otraOperacion.equalsIgnoreCase("si"));


    }
}
