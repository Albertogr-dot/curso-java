import java.util.Scanner;

public class proyectoFinal {
    static void main(String[] args) {
        boolean repeat;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce tu edad");
            int edad = scanner.nextInt();

            System.out.println("Ingresa tus tres últimas notas");
            int primeraNota = scanner.nextInt();
            int segundaNota = scanner.nextInt();
            int terceraNota = scanner.nextInt();

            int suma = primeraNota+segundaNota+terceraNota;
            double media = suma/3.0;

            if(media <=5){
                System.out.println("suspenso");
            }else{
                System.out.println("aprobado");
            }
            System.out.println("Quieres introducir algún nuevo dato? pulsa 1 para sí o 2 para no");
            int nuevoDato = scanner.nextInt();

            repeat = nuevoDato == 1;
        }while (repeat);

        System.out.println("Programa finalizado");


    }
}
