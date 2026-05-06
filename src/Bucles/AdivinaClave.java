package Bucles;

import javax.swing.*;

public class AdivinaClave {
    static void main(String[] args) {

         String contrasena="Alberto";
         String clave="";
         int intentos=0;
         int maxIntentos=3;

         while (contrasena.equalsIgnoreCase(clave)==false && intentos<maxIntentos){
             clave= JOptionPane.showInputDialog("Introduce la clave");

             if(contrasena.equalsIgnoreCase(clave)==false){
                 intentos++;
                 System.out.println("Clave incorrecta");
             }
         }

         if (contrasena.equalsIgnoreCase(clave)){
             System.out.println("Clave correcta");
         } else{
             System.out.println("Numero máximo de intentos superado");
         }
    }
}
