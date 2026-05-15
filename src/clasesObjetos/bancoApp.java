package clasesObjetos;

import java.util.Scanner;

public class bancoApp {

    private cuentaBanco cuenta;
    private Scanner scanner;

    public bancoApp(cuentaBanco cuenta) {
        this.cuenta = cuenta;
        this.scanner=new Scanner(System.in);
    }

    private void menu(){
        System.out.println("Selecciona una opción");
        System.out.println("Introducir dinero");
        System.out.println("Retirar dinero");
        System.out.println("Mostrar saldo");
        System.out.println("Salir");
    }

    private int opcionUsuario(){
        return scanner.nextInt();
    }

    private void deposito(){
        System.out.println("Ingresa cantidad a depositar");
        double deposito= scanner.nextDouble();
        cuenta.deposito(deposito);
    }

    private void retirada(){
        System.out.println("Ingresa cantidad a retirar");
        double retirada= scanner.nextDouble();
        cuenta.retirada(retirada);
    }

    private void opcionUsuario(int opcion){
        switch (opcion){
            case 1:{
                deposito();
                break;
            }
            case 2:{
                retirada();
                break;
            }
            case 3:{


            }
            case 4:{
                System.out.println("Gracias por usar la aplicación");
            }
            default:{
                System.out.println("Opción incorrecta");
            }
        }
    }
}
