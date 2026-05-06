package Enum;

/*           Crea un enum llamado Semaforo con valores:
                -ROJO
                -AMARILLO
                -VERDE
             En el main:
                -Declara una variable de tipo Semaforo
                -Asígnale un valor
             Usa un switch para mostrar:
                -ROJO → "Detente"
                -AMARILLO → "Precaución"
                -VERDE → "Avanza"*/

public class Ejercicio2 {

    enum semaforo{rojo, amarillo, verde}

    static void main(String[] args) {

        semaforo estado=semaforo.verde;

        System.out.println("Estado " + estado);

        switch (estado){

            case rojo:
                System.out.println("Detente");
                break;
            case amarillo:
                System.out.println("Precaución");
                break;
            case verde:
                System.out.println("Adelante");
                break;
        }


    }
}
