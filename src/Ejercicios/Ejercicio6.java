package Ejercicios;

     /*  -programa crea número aleatorio
         -q me pregunte si quiero nivel fácil (1-50) medio (1-100) o difícil (1-500)
         -tengo 10 vidas, si me quedo sin intentos pierdo
         -además de "más alto" o "más bajo", decir muy lejos (diferencia +20) o cerca (dif <= 10)
         -cuando termine preguntar si quiero jugar de nuevo y si es que sí, volver a empezar.
      */

import java.util.Scanner;

public class Ejercicio6 {

    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int vidas=10;
        int aleatorio=(int)(Math.random()*100);
        int numero;
        int nivel=0;

        do{

            System.out.println("Introduce un número");
            numero= scanner.nextInt();

            if(numero>aleatorio){
                vidas--;
                System.out.println("Más bajo, te quedan " + vidas + " intentos");


            } else if(numero<aleatorio){
                vidas--;
                System.out.println("Más alto, te quedan " + vidas + " intentos");


              } else{
                System.out.println("Correcto, el número era " + aleatorio);
                }


        } while(aleatorio != numero && vidas>0);

        if(numero!=aleatorio && vidas==0){
            System.out.println("GAME OVER");
        }


    }
}
