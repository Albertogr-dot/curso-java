package Enum;

import java.util.Scanner;

public class Ejercicio {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){

            System.out.println("Introduce tu talla");
            String talla = sc.nextLine();

            if(talla.equals("s")){
                System.out.println("Talla pequena");
            }else if(talla.equals("m")){
                System.out.println("Talla mediana");
            }else if(talla.equals("l")){
                System.out.println("Talla grande");
            }else if(talla.equals("xl")){
                System.out.println("Talla muy grande");
            }
            System.out.println("Quieres introducir otra talla?");
            String respuesta = sc.next();

            if(respuesta.equalsIgnoreCase("no")){
                continuar = false;
                System.out.println("Programa finalizado");
            }
        }
        Scanner close;

    }
}
