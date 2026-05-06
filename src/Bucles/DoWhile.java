package Bucles;

import java.util.Scanner;

public class DoWhile {
    static void main(String[] args) {


            int aleatorio = (int)(Math.random()*100);
            Scanner entrada = new Scanner(System.in);

        int numero=0;
        int intentos=0;

        do{
            intentos++;
            System.out.println("Introduce un número");
            numero = entrada.nextInt();

            if(numero<aleatorio){
                System.out.println("Más alto");
            }else if(numero>aleatorio){
                System.out.println("Más bajo");
            }
        }while(numero!=aleatorio);


        System.out.println("Correcto, adivinado en " +intentos+ " intentos");
    }
}
