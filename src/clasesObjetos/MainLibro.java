package clasesObjetos;

public class MainLibro {

    public static void main(String[] args) {

        Libro l1=new Libro("El quijote","miguel de cervantes", 1500, 50);
        Libro l2=new Libro("El principito", "Antoine de Saint-Exupéry", 230, 25);

        System.out.println(l1.toString());
        System.out.println(l2.toString());

    }
}
