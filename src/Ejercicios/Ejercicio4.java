package Ejercicios;

/*  -Pida al usuario dos números enteros positivos: inicio y fin.
    -Recorra todos los números entre inicio y fin.
    -Para cada número, determine si es par o impar.*/

import java.util.Scanner;

public class Ejercicio4 {

    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int inicio=0;
        int fin=0;

        System.out.println("introduce un número");
        inicio= scanner.nextInt();

        System.out.println("introduce otro número");
        fin= scanner.nextInt();

        for(int i=inicio; i<fin; i++){

            if(i%2==0){
                System.out.println("número " + i + " par");
            } else{
                System.out.println("número " + i + " impar");
            }

        }
    }
}
