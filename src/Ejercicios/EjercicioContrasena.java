package Ejercicios;
import javax.swing.*;

public class EjercicioContrasena {
    static void main(String[] args) {

        String contrasena = "Alberto";
        String clave = "";

        while (contrasena.equalsIgnoreCase(clave)==false){
            clave = JOptionPane.showInputDialog("Introduce la contrasena");

            if(contrasena.equalsIgnoreCase(clave)==false){
                System.out.println("Contrasena incorrecta");
            }
        }

        System.out.println("Contrasena correcta");
    }
}
