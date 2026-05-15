package Ejercicios;

import java.util.Scanner;

public class EjercicioBorrador2 {

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        String contraseña="Albertaco";
        String clave;
        int intentos=3;

        do{

            System.out.println("Introduce la clave");
            clave=entrada.next();

            if(clave.equalsIgnoreCase(contraseña)){
                System.out.println("Acceso permitido");
            }else{
                intentos--;
                System.out.println("contraseña incorrecta " + "te quedan " + intentos + " intentos");
            }

        }while(contraseña!=clave && intentos>0);

    }
}
