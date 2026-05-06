package Bucles;

/*Pida al usuario 10 números
Guarde Cuántos son pares
Cuántos son impares
La suma total
Al final muestre: Total de pares, Total de impares, Suma de todos los números*/

import java.util.Scanner;

public class Ejercicio3 {

    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int pares=0;
        int impares=0;
        int suma=0;
        int numeros=0;


        for(int i=0; i<10; i++){

            System.out.println("Introduce 1 número");
            numeros=sc.nextInt();
            suma=numeros+suma;

            if(numeros%2==0){
                pares++;
            } else {
                impares++;
            }

        }

        System.out.println("los numeros pares son " + pares);
        System.out.println("los numeros impares son " + impares);
        System.out.println("la suma de tus numeros es " + suma);



    }
}
