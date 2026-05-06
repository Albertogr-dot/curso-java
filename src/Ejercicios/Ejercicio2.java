package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int primerNumero=0;
        int segundoNumero=0;


            System.out.println("Introduce un numero");
            primerNumero = scanner.nextInt();

            System.out.println("Introduce otro numero");
            segundoNumero = scanner.nextInt();


        System.out.println("La suma de tus números es " + (primerNumero+segundoNumero));
    }
}
