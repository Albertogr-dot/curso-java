package clasesObjetos;

public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante e1=new Estudiante("Alberto", 29, 7);
        Estudiante e2=new Estudiante("Francisco", 30, 9);
        Estudiante e3=new Estudiante("Pedro", 20, 6);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

    }
}
