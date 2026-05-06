package ClaseString;

public class apuntesClase {
    static void main(String[] args) {

        String nombre = "alberto";
        String nombre2= "Alberto";
        System.out.println(nombre.toUpperCase());

        System.out.println(nombre.equals(nombre2));
        System.out.println(nombre.equalsIgnoreCase(nombre2));

        System.out.println("El nombre tiene " + nombre.length() + " letras");

        System.out.println("La tercera posición corresponde al caracter " + nombre.charAt(3));

        System.out.println(nombre.replace("a" , "o"));

    }
}
