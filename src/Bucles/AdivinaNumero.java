package Bucles;

import java.util.Scanner;

public class AdivinaNumero {
    static void main(String[] args) {

        int aleatorio = (int)(Math.random()*10000);
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        int intentos = 0;

        while(numero!=aleatorio){
            intentos++;

            System.out.println("Introduce un número");
            numero = entrada.nextInt();

            if(numero<aleatorio){
                System.out.println("Más alto");
            } else if (numero>aleatorio) {
                System.out.println("Más bajo");

            }
        }
        System.out.println("Correcto, conseguido en " + intentos + " intentos");
    }
}
