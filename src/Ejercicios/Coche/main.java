package Ejercicios.Coche;

import Ejercicios.cochazo;

public class main {

    public static void main(String[] args) {

        cochazo coche = new cochazo("audi", "a4", 2020, 80);

        coche.mostrarInfo();

        System.out.println("\nAcelerando...");
        coche.acelerar(60);

        coche.mostrarInfo();

        System.out.println("\nFrenando...");
        coche.frenar(30);

        coche.mostrarInfo();

    }
}
