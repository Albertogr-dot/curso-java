package Arrays;

/*      Haz un programa que:

        -Cree un array de 3 enteros
        -Pida al usuario 3 números
        -Los guarde en el array
        -Los muestre por pantalla*/

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int[]numeros=new int[3];
        System.out.println("Introduce 3 números");

        int mayor=numeros[0];
        int menor=numeros[0];
        int suma=0;


        for(int i=0; i<numeros.length; i++){
            numeros[i]= scanner.nextInt();

            if(numeros[i]>mayor){
                mayor=numeros[i];
            } else if (numeros[i]<menor){
                menor=numeros[i];
            }
            suma=suma+numeros[i];
        }

        double media = (double) suma / numeros.length;

        for(int i=0; i<numeros.length; i++){
            System.out.println("Número introducido: " + numeros[i]);
        }
        System.out.println("El mayor número es " + mayor);
        System.out.println("La suma de tus números es " + suma);
        System.out.println("El número menor es " + menor);
        System.out.println("La media de tus números es " + media);

    }

}
