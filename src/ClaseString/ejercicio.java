package ClaseString;

import java.util.Scanner;

public class ejercicio {

    static void main(String[] args) {
        Scanner nombre1 = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre1Variable = nombre1.nextLine();

        Scanner nombre2 = new Scanner(System.in);
        System.out.println("Introduce otro nombre");
        String nombre2Variable = nombre2.nextLine();

        if(nombre1Variable.equals(nombre2Variable)){
            System.out.println("Los nombres son idénticos");
        }else{
            System.out.println("Los nombres no coinciden");
        }

        Scanner close;
    }
}
