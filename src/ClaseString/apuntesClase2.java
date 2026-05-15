package ClaseString;

public class apuntesClase2 {
    static void main(String[] args) {

        String text="Alberto Gonzalez Robles";
        String text2="alberto gonzalez robles";
        String textoConEspacios="    Alberto gonzalez robles       ";

        System.out.println("Número de caracteres: " + text.length());
        System.out.println("Mayúsulas: " + text.toUpperCase());
        System.out.println("Minúsculas: " + text.toLowerCase());
        System.out.println("caracter en la posición 5: " + text.charAt(5));
        System.out.println("Subcadena: " + text.substring(0, 7));

        System.out.println("Son iguales? " + text.equals(text2));
        System.out.println("Son iguales ignorando mayúsculas? " + text.equalsIgnoreCase(text2));

        System.out.println("Contiene la palabra robles? " + text.contains("Robles"));
        System.out.println("reemplazo: " + text.replace("o", "a"));

        System.out.println("Texto sin espacios: " + textoConEspacios.trim());

        // esto elimina los espacios Únicamente al principio y al final de la cadena.

    }
}
