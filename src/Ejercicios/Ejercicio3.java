package Ejercicios;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int numero=0;
        String respuesta="si";

        do {

            System.out.println("Introduce un numero");
            numero=Integer.parseInt(scanner.nextLine());

            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("multiplo de 3 y 5");
            } else if (numero % 3 == 0) {
                System.out.println("numero solo multiplo de 3");
            } else if (numero % 5 == 0) {
                System.out.println("numero solo multiplo de 5");
            } else {
                System.out.println("numero no multiplo de ninguno");
            }
            System.out.println("quieres introducir otro numero? responde con si o no");
            respuesta= scanner.nextLine();

        } while(respuesta.equalsIgnoreCase("si"));

    }

}

