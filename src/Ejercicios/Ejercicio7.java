package Ejercicios;

/*      -Crear un array de 7 posiciones para guardar la temperatura de cada día de la semana.
        -Pedir al usuario las 7 temperaturas.
            Mostrar:
        -Cuántos días hizo calor (temperatura >= 30)
        -Cuántos días hizo frío (temperatura <= 10)
        -La temperatura máxima
        -La temperatura mínima*/

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        int[]dias=new int[7];
        int temperatura;

        for(int i=0; i<dias.length; i++){

            System.out.println("temperatura día " + (i+1) + " :");
            dias[i]=entrada.nextInt();
            temperatura=dias[i];



            if(temperatura>=30){
                System.out.println("Día de calor");
            } else if(temperatura>=20 && temperatura <30){
                System.out.println("Día de temperatura moderada");
            } else if (temperatura>=10 && temperatura<20){
                System.out.println("Día de fresco");
            } else if(temperatura>=0 && temperatura<10){
                System.out.println("Día de mucho frío");
            }

        }

    }
}
