package Bucles;

/* -Genere un número secreto (por ejemplo, fijo para empezar)
   -Pida al usuario que adivine el número
   -Use un bucle para seguir preguntando hasta acertar
   -Use condicionales para dar pistas:
   -“El número es mayor”
   -“El número es menor”
   -Cuente cuántos intentos ha hecho el usuario*/

import java.util.Scanner;

public class Ejercicio2 {


    static void main(String[] args) {

        int randomNumber=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        int numero=0;
        int intentos=0;

        while (numero!=randomNumber){
            System.out.println("Introduce un numero");
            intentos++;
            numero= sc.nextInt();

            if(numero<randomNumber){
                System.out.println("mas alto");
            } else if(numero>randomNumber){
                System.out.println("mas bajo");
            }
        }

        System.out.println("Correcto, el número era " + randomNumber + " lo has adivinado en " + intentos + " intentos");

    }
}
