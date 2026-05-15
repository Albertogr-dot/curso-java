package Ejercicios;

import java.util.Scanner;

public class EjercicioBorrador {
    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1=scanner.nextInt();

        System.out.println("Introduce otro número");
        numero2=scanner.nextInt();

        System.out.println("La suma de tus números es: " + (numero1+numero2));
        System.out.println("La resta de tus números es: " + (numero1-numero2));
        System.out.println("La multiplicación de tus números es: " + (numero1*numero2));


    }
}
