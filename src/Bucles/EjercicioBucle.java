package Bucles;

import java.util.Scanner;

public class EjercicioBucle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        for (int i=0; i<=10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }
    }
}
