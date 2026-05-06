package Calculadora;

import java.util.Scanner;

public class EjercicioCalculadora {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Introduce el primer número");
            int numero = sc.nextInt();

            System.out.println("Introduce el segundo número");
            int numero2 = sc.nextInt();

            if (numero < 0 || numero2 < 0) {
                System.out.println("Ingresa solo un número positivo");
            } else {

                System.out.println("Que quieres hacer: +(sumar) , -(restar) , /(dividir) , *(multiplicar) ?");
                String cálculo = sc.next();

                if (cálculo.equals("+")) {
                    System.out.println("La suma de tus números es: " + (numero + numero2));

                } else if (cálculo.equals("-")) {
                    System.out.println("La resta de tus números es: " + (numero - numero2));
                } else if (cálculo.equals("*")) {
                    System.out.println("La multiplicación de tus números es: " + (numero * numero2));
                } else if (cálculo.equals("/")) {
                    System.out.println("La división de tus números es: " + (numero / numero2));
                }
                System.out.println("Quieres hacer otra operacion? responde con si o no");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("no")) {
                    continuar=false;
                    System.out.println("Programa finalizado");
                }

                }
                Scanner close;

            }
        }

    }

